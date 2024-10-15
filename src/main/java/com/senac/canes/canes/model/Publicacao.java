package com.senac.canes.canes.model;

public class Publicacao extends Postagem{
    private String descricao;

    public Publicacao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String exibir() {
        return "Publicacao com descrição: " + descricao;
    }
}
