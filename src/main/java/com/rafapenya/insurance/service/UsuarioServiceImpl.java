package com.rafapenya.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafapenya.insurance.repository.UsuarioRepository;
import com.rafapenya.insurance.model.Usuario;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario getUsuarioById(int id) {
        Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
        if (optionalUsuario.isPresent()) {
            return optionalUsuario.get();
        } else {
            // Puedes manejar esto de manera diferente, dependiendo de tus necesidades.
            // Por ejemplo, puedes lanzar una excepción si el usuario no se encuentra.
            return null;
        }
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario updateUsuario(int id, Usuario usuario) {
        if (usuarioRepository.existsById(id)) {
            usuario.setId(id);
            return usuarioRepository.save(usuario);
        } else {
            // Similarmente aquí, puedes manejar esto de manera diferente.
            // Por ejemplo, puedes lanzar una excepción si el usuario no se encuentra.
            return null;
        }
    }

    @Override
    public void deleteUsuario(int id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
        } else {
            // Nuevamente, decide cómo deseas manejar este caso.
            // Podrías lanzar una excepción o simplemente ignorarla.
        }
    }
}
