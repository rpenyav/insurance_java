package com.rafapenya.insurance.service;

import com.rafapenya.insurance.model.Usuario;
import java.util.List;




public interface UsuarioService {
    List<Usuario> getAllUsuarios();
    Usuario getUsuarioById(int id);
    Usuario createUsuario(Usuario usuario);
    Usuario updateUsuario(int id, Usuario usuario);
    void deleteUsuario(int id);
}
