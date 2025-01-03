/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.spring.crud;

import com.ejemplo.spring.crud.Usuario;
import com.ejemplo.spring.crud.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 *
 * @author sistemas03
 */
@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    //crear Usuario
    public Usuario agregarUsuario(Usuario usuario)
    {
        return usuarioRepository.save(usuario);
    }
    //obtener datos de usuario
    public List<Usuario> obtenerUsuarios()
    {
        return usuarioRepository.findAll();
    }
    
    //Obtener usuario por id
    public Optional<Usuario> ObtenerUsuarioID (Long ID)
    {
        return usuarioRepository.findById(ID);
    }
    public Usuario actualizarUsuario(long id, Usuario usuarioActualizado)
    {
        return usuarioRepository.findById(id).map(usuario -> 
        {
            usuario.setName(usuarioActualizado.getName());
            usuario.setCountry(usuarioActualizado.getCountry());
            usuario.setCode(usuarioActualizado.getCode());
            usuario.setWeb(usuarioActualizado.getWeb());
            return usuarioRepository.save(usuario);
        }).orElseThrow(() -> new RuntimeException("USUARIO NO ENCONTRADO"));
    }
    public void eliminarUsuario(Long id)
    {
        usuarioRepository.deleteById(id);
    }
}
