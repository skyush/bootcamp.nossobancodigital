package br.com.marianno.bootcamp.nossobancodigital.entity;

import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue()
    private Long id;

    @NonNull
    private String nome;

    @NonNull
    private String sobrenome;

    @NonNull
    @Column(unique=true)
    private String email;

    @NonNull
    private String nascimento;

    @NonNull
    @Column(unique=true)
    private String cpf;

    public Cliente() {
    }

    public Cliente(Long id, @NonNull String nome, @NonNull String sobrenome, @NonNull String email, @NonNull String nascimento, @NonNull String cpf) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.nascimento = nascimento;
        this.cpf = cpf;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
