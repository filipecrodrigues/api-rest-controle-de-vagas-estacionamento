package com.filipecandido.controleestacionamento.service;

import com.filipecandido.controleestacionamento.entity.User;
import com.filipecandido.controleestacionamento.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    //variável userRepository é referência do Objeto UserREpository
    private final UserRepository userRepository;

    @Transactional
    public User saveUser(User user) {
        return userRepository.save(user);
    }


    @Transactional
    public User getIdUser(Long id) {

        return userRepository.findById(id).orElseThrow(//retorne o usuario ou lançe uma exceção
                () -> new RuntimeException("Usuário não encontrado")
        );}
    @Transactional
    public User changePasswordUser(Long id, String password){
        User user = getIdUser(id);
        user.setPassword(password);
        return user;
    }
    @Transactional
    public List<User> getByAllUsers() {

        return userRepository.findAll();
    }
}
