package com.codo.grupo4.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.codo.grupo4.dao.ArticuloDAO;
import com.codo.grupo4.model.Articulo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin(origins = "*")
public class ArticuloController {

    // Lista todos los articulos
    
    @GetMapping("/listarArticulos")
    public List<Articulo> listaArticulos() {
        ArticuloDAO articuloDAO = new ArticuloDAO();
        return articuloDAO.listarArticulo();
    }

    // buscador que busca todos los articulos por categoria
    @GetMapping("/buscarPorCat/{categoria}")
    public List<Articulo> buscarPorCat(@PathVariable("categoria") String categoria) {
        ArticuloDAO articuloDAO = new ArticuloDAO();
        return articuloDAO.buscarPorCat(categoria);
    }


    @GetMapping("/artInfo/{id}")
    public List<Articulo> artInfo(@PathVariable("id") Integer id) {
        ArticuloDAO articuloDAO = new ArticuloDAO();
        return articuloDAO.artInfo(id);
    }
    


    @PostMapping("/addArticulo")
    public Boolean addArticulo(@RequestBody Articulo articulo) {
        ArticuloDAO articuloDAO = new ArticuloDAO();
        
        return articuloDAO.addArticulo(articulo);
    }
    
}
