package com.filipecandido.api_controle_vagas_estacionamento.web.controller;


import com.filipecandido.api_controle_vagas_estacionamento.entity.User;
import com.filipecandido.api_controle_vagas_estacionamento.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequiredArgsConstructor //Injeção de dependecias será feira via metodo construtor

@RestController
@RequestMapping("api/v1/usuarios")
public class UserController {

    private final UserService userService;

    //metodo post(criar um usuario no db)
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {//para encapsular o objeto usuario
        User userName = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user); //objeto user para criar usuario no banco de dados
    }
    //metodo get (buscar por id)
    @GetMapping("{id}")
    public ResponseEntity<User> getById(@PathVariable Long id) {//pega o id e adiciona em uma variavel tipo long
        User userName = userService.getIdUser(id);
        return ResponseEntity.ok(userName);
    }

    //metodo Pathmapping (para atualizar parcial a senha)
    @PatchMapping("{id}")
    public ResponseEntity<User> updatePassword(@PathVariable Long id, @RequestBody User user) {//pega o id e adiciona em uma variavel tipo long
        User userName = userService.changePasswordUser(id, user.getPassword());
        return ResponseEntity.ok(userName);
    }

    //metodo get (buscar todos)
    @GetMapping
    public ResponseEntity<List<User>>getByAll() {
        List<User> users = userService.getByAllUsers();
        return ResponseEntity.ok(users);
    }
}
