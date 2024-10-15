package com.senac.canes.canes.model;

public class Reel extends Postagem{
    private String duracao;
    private String descricao;

    public Reel(String duracao, String descricao) {
        this.duracao = duracao;
        this.descricao = descricao;
    }

    @Override
    public String exibir() {
        return "Reel com duração de " + duracao + " e descrição: " + descricao;
    }
}
