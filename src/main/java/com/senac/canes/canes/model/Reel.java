package com.senac.canes.canes.model;

public class Reel extends Postagem{
    private String duracao;
    private String descricao;

    public Reel(String curtida, String comentario, String midia, String duracao, String descricao) {
        super(curtida, comentario, midia);
        this.duracao = duracao;
        this.descricao = descricao;
    }

    public Reel() {
    }

    @Override
    public String exibir() {
        return "Reel com duração de " + duracao + " e descrição: " + descricao;
    }
}
