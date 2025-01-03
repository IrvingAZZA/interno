/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.spring.crud;
import com.ejemplo.spring.crud.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author sistemas03
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
