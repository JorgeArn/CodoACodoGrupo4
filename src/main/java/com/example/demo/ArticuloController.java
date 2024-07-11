package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ArticuloDAO;
import com.example.demo.model.Articulo;

@RestController
public class ArticuloController {

    @CrossOrigin(origins = "*")
    @GetMapping("/listarArticulos")
    public List<Articulo> listarArticulos() {
        ArticuloDAO articuloDAO = new ArticuloDAO();
        return articuloDAO.listar();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/addArticulo")
    public boolean addArticulo(@RequestBody Articulo articulo) {

        ArticuloDAO articuloDAO = new ArticuloDAO();
        return articuloDAO.add(articulo);

    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/delArticulo/{id}")
    public void delArticulo(@PathVariable("id") Integer id) {
        Articulo articulo = new Articulo(id);

        ArticuloDAO articuloDAO = new ArticuloDAO();
        articuloDAO.del(articulo);

    }

    @GetMapping("/artInfo/{id}")
    public Articulo artInfo(@PathVariable("id") Integer id) {
        ArticuloDAO articuloDAO = new ArticuloDAO();
        return articuloDAO.artInfo(id);
    }

    // buscador que busca todos los articulos por categoria
    @GetMapping("/buscarPorCat/{categoria}")
    public List<Articulo> buscarPorCat(@PathVariable("categoria") String categoria) {
        ArticuloDAO articuloDAO = new ArticuloDAO();
        return articuloDAO.buscarPorCat(categoria);
    }
}
