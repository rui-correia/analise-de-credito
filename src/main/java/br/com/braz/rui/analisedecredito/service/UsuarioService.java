package br.com.braz.rui.analisedecredito.service;

import br.com.braz.rui.analisedecredito.domain.Usuario;
import br.com.braz.rui.analisedecredito.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario cadastrarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
        return usuario;
    }

}
