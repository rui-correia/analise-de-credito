package br.com.braz.rui.analisedecredito.request;

import br.com.braz.rui.analisedecredito.domain.Cargo;
import br.com.braz.rui.analisedecredito.domain.Usuario;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;

public class UsuarioRequest {

    @NotBlank(message = "Nome não pode ficar em branco.")
    private String nome;
    @CPF(message = "CPF com formato invalido.")
    private String cpf;
    @Email(message = "Email com formato invalido.")
    private String email;
    @NotBlank
    @Size(min = 6, max = 10, message = "Senha deve conter entre 6 e 10 caracteres.")
    private String senha;
    @NotNull(message = "Caro nao pode ser vazio.")
    private Cargo cargo;

    public Usuario toModel() {
        return new Usuario(this.nome, this.cpf, this.email, this.senha, this.cargo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}