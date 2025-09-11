package com.filipecandido.api_controle_vagas_estacionamento.web.controller;


import com.filipecandido.api_controle_vagas_estacionamento.entity.User;
import com.filipecandido.api_controle_vagas_estacionamento.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor //Injeção de dependecias será feira via metodo construtor

@RestController
@RequestMapping("api/v1/usuarios")
public class UserController {

    private final UserService userService;

    //metodo post
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {//para encapsular o objeto usuario
        User userName = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user); //objeto user para criar usuario no banco de dados
    }
    //metodo get
    @GetMapping("{id}")
    public ResponseEntity<User> getById(@PathVariable Long id) {//pega o id e adiciona em uma variavel tipo long
        User userName = userService.getIdUser(id);
        return ResponseEntity.ok(userName);
    }


}
