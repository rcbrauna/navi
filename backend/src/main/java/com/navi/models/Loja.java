package com.navi.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Loja")
public class Loja {

    @Id
    @GeneratedValue
    @Column(name = "id_vendedor")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao", length = 1000)
    private String descricao;

    @OneToOne
    @Column(name = "fk_endereco")
    private Endereco endereco;

    @OneToOne
    @Column(name = "fk_vendedor")
    private Vendedor vendedor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}