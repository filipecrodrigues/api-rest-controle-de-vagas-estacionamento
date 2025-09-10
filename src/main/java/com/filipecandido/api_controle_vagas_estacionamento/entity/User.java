package com.filipecandido.api_controle_vagas_estacionamento.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter @Setter @NoArgsConstructor
@Entity //Diz para o JPA/Hibernate que a classe representa uma entidade no banco de dados
@Table(name = "usuarios") // espefificar qual tabela do banco a entidade vai mapear

public class Usuario implements Serializable {

            //mapeamento do campo id
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)

            @Column(name = "id")
            private Long id;

            @Column(name = "username", nullable = false, unique = true, length = 100)
            private String username;

            @Column(name = "password", nullable = false, length = 200)
            private String password;

            @Enumerated(EnumType.STRING)
            @Column(name = "role", nullable = false, length = 25)
            private Role role;


            @Column(name = "creation-date")
            private LocalDateTime creationDate;

            @Column(name = "modification-date")
            private LocalDateTime modificationDate;

            @Column(name = "created-by")
            private String createdBy;

            @Column(name = "modifier-by")
            private String modifierBy;


    public enum Role{
                ROLE_ADMIN, ROLE_CLIENT
            }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                '}';
    }
}

