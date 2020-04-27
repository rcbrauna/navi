package com.navi.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.relational.core.sql.In;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Vendedor")
public class Vendedor {

    @Id
    @GeneratedValue
    @Column(name = "id_vendedor")
    private Integer id;

    @Column(name = "nome", length = 100)
    private String nome;

    @Column(name = "email", length = 100)
    @Email(message = "* Email é obrigatório")
    private String email;

    @Column(name = "senha", length = 100)
    @Length(min = 5, message = "A senha deve ter mais de 5 caracteres")
    private String senha;

    @Column(name = "telefone", length = 20)
    private String telefone;

    @Column(name = "n_cnpj")
    private Integer cnpj;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }

    public void setSenha(String senha) { this.senha = senha; }

    public String getTelefone() { return telefone; }

    public void setTelefone(String telefone) { this.telefone = telefone; }

    public Integer getCnpj() { return cnpj; }

    public void setCnpj(Integer cnpj) { this.cnpj = cnpj; }
}