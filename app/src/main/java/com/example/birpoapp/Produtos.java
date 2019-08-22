package com.example.birpoapp;

public class Produtos {
    private int imgProd;
    private String nome;
    private String descricao;
    private int quantidade;


    public Produtos() {
    }

    public Produtos(int imgProd, String nome, String descricao, int quantidade) {
        this.imgProd = imgProd;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public int getImgProd() {
        return imgProd;
    }

    public void setImgProd(int imgProd) {
        this.imgProd = imgProd;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
