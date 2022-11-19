package com.Udemy.ProjetoCurso.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Categoria {
    private Integer Id;
    private String Nome;
    private String Descricao;

    private List<Livro> livros =  new ArrayList<>();

    public Categoria() {
        super();
    }

    public Categoria(Integer id, String nome, String descricao) {
        Id = id;
        Nome = nome;
        Descricao = descricao;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Categoria)) return false;
        Categoria categoria = (Categoria) o;
        return getId().equals(categoria.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
