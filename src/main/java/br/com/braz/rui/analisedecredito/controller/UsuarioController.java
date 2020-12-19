package br.com.braz.rui.analisedecredito.controller;

import br.com.braz.rui.analisedecredito.domain.Usuario;
import br.com.braz.rui.analisedecredito.request.UsuarioRequest;
import br.com.braz.rui.analisedecredito.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping(value = "/cadastrar-usuario")
    @Transactional
    public ResponseEntity<Usuario> cadastrarUsuario(@Valid @RequestBody UsuarioRequest usuarioRequest){

        Usuario usuario = usuarioRequest.toModel();
        usuarioService.cadastrarUsuario(usuario);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
