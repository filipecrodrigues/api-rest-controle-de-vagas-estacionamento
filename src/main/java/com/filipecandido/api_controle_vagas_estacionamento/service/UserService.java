package com.filipecandido.api_controle_vagas_estacionamento.service;

import com.filipecandido.api_controle_vagas_estacionamento.entity.User;
import com.filipecandido.api_controle_vagas_estacionamento.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public User saveUser(User user) {
        return userRepository.save(user);
    }


    @Transactional
    public User getIdUser(Long id) {

        return userRepository.findById(id).orElseThrow(//retorne o usuario ou lançe uma exceção
                () -> new RuntimeException("Usuário não encontrado")
        );

    }
}
