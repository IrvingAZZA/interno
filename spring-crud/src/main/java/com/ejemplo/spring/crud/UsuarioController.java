/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.spring.crud;
import com.ejemplo.spring.crud.Usuario;
import com.ejemplo.spring.crud.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 *
 * @author sistemas03
 */

@RestController
@RequestMapping("/api/list_of_universities")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    
    //Crear usuario
    @PostMapping
    public ResponseEntity<Usuario> agregarUsuario(@RequestBody Usuario usuario)
    {
        Usuario newusuario = usuarioService.agregarUsuario(usuario);
        return ResponseEntity.ok(newusuario);
    }
    //ver los usuarios
    @GetMapping
    public List<Usuario> obtenerUsuario()
    {
        return usuarioService.obtenerUsuarios();
    }
    //obtener usuario por ID
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obeterUsariopoID(@PathVariable Long id)
    {
        return usuarioService.ObtenerUsuarioID(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
