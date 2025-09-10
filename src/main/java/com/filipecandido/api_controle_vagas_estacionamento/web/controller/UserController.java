package com.filipecandido.api_controle_vagas_estacionamento.web.controller;


import com.filipecandido.api_controle_vagas_estacionamento.entity.User;
import com.filipecandido.api_controle_vagas_estacionamento.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor //Injeção de dependecias será feira via metodo construtor

@RestController
@RequestMapping("api/v1/usuarios")
public class UserController {

    private final UserService userService;

    //para encapsular o objeto usuario
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User userName = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user); //objeto user para criar usuario no banco de dados
    }


}
