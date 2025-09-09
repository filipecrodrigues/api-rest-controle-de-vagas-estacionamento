package com.filipecandido.api_controle_vagas_estacionamento.repository;

import com.filipecandido.api_controle_vagas_estacionamento.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
