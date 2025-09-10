package com.filipecandido.api_controle_vagas_estacionamento.web.controller;


import com.filipecandido.api_controle_vagas_estacionamento.entity.Usuario;
import com.filipecandido.api_controle_vagas_estacionamento.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor //Injeção de dependecias sera feira via metodo construtor

@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    //para encapsular o objeto usuario
    public ResponseEntity<Usuario> createUser(@RequestBody Usuario usuario) {

    }


}
