package com.filipecandido.api_controle_vagas_estacionamento.repository;

import com.filipecandido.api_controle_vagas_estacionamento.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
