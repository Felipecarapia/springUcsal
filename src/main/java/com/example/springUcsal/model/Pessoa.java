package com.example.springUcsal.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro_pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String sobrenome;

    public Pessoa() {

    }

    public Pessoa(String nome, String sobrenome, Long id) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
