package br.com.bossini.consomewsrestjson;

import java.io.Serializable;

public class Livro implements Serializable {

    private String titulo;
    private String autor;
    private int numeroPaginas;
    private String edicao;
    public Livro(String titulo, String autor, String edicao) {
        setTitulo(titulo);
        setAutor(autor);
        setEdicao(edicao);
    }
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

}