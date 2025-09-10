package com.filipecandido.api_controle_vagas_estacionamento.service;

import com.filipecandido.api_controle_vagas_estacionamento.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;


}
