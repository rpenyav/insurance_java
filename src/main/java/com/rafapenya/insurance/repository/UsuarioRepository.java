package com.rafapenya.insurance.repository;

import com.rafapenya.insurance.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
   
}
