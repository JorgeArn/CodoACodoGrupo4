package com.example.demo;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ArticuloDAO;
import com.example.demo.dao.UsuarioDAO;
import com.example.demo.model.Articulo;
import com.example.demo.model.Usuario;

@RestController
@CrossOrigin(origins = "*")

public class UsuarioController {

    @GetMapping("/listarUsuarios")
    public List<Usuario> listarUsuarios() {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        return usuarioDAO.listar();
    }

    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario usuario) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        return usuarioDAO.login(usuario.getEmail(), usuario.getClave());

    }

    // funciona por el constructor vacio, hay que ver lo de la fecha
    @PostMapping("/addUsuario")
    public boolean addUsuario(@RequestBody Usuario usuario) {

        usuario.setAdmin(false);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        return usuarioDAO.add(usuario);

    }

    @DeleteMapping("/delUsuario/{id}")
    public void delUsuario(@PathVariable("id") Integer id) {
        Usuario usuario = new Usuario(id);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.del(usuario);

    }
}
