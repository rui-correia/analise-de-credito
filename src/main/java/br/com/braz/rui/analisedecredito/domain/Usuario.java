package br.com.braz.rui.analisedecredito.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Usuario {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private Cargo cargo;

    @Deprecated
    public Usuario() {
    }

    public Usuario(String nome, String cpf, String email, String senha, Cargo cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.cargo = cargo;
    }


}
