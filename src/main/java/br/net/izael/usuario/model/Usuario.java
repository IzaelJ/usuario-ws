package br.net.izael.usuario.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "tb_usuarios")
public class Usuario
        implements Serializable {
    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "id_usu")
    private Long id;
    @Column(name = "nome_usu")
    private String nome;
    @Column(name = "login_usu")
    private String login;
    @Column(name = "senha_usu")
    private String senha;
    @Column(name = "perfil_usu")
    private String perfil;

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public String getPerfil() {
        return perfil;
    }

    public String getSenha() {
        return senha;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Construtores, setters/getters
}