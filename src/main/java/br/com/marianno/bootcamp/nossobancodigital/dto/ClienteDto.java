package br.com.marianno.bootcamp.nossobancodigital.dto;

import br.com.marianno.bootcamp.nossobancodigital.entity.Cliente;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

public class ClienteDto {

    private Long id;
    private String nome;
    private String sobrenome;

    @Email(message="Formato do email inválido")
    private String email;

    private String nascimento;

    @Pattern(regexp = "^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$", message = "Formato do cpf inválido")
    private String cpf;

    public ClienteDto() {
    }

    public ClienteDto(Long id, String nome, String sobrenome, String email, String nascimento, String cpf) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.nascimento = nascimento;
        this.cpf = cpf;
    }

    public static ClienteDto toDto(Cliente cliente) {
        return new ClienteDto(cliente.getId(), cliente.getNome(), cliente.getSobrenome(), cliente.getEmail(), cliente.getNascimento(), cliente.getCpf());
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

    public Cliente toEntity() {
        return new Cliente(id, nome, sobrenome, email, nascimento, cpf);
    }
}
