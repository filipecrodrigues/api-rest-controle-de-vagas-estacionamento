package com.filipecandido.controleestacionamento.repository;

import com.filipecandido.controleestacionamento.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
