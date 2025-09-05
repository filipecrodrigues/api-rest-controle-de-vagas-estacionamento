package com.filipecandido.api_controle_vagas_estacionamento.config;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.TimeZone;

@Configuration ///Indica que uma classe de configuração
public class SpringTimezoneConfig {

    //metodo que define o timezone
    @PostConstruct //apos ser inicializado o contrutor o próximo metodo será o timeConfig
    public void timezoneConfig(){
        TimeZone.setDefault(TimeZone.getTimeZone("America/São_Paulo"));
    }
}
