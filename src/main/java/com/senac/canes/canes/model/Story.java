package com.senac.canes.canes.model;

public class Story extends Postagem {
    private String interacoes;

    public Story(String interacoes) {
        this.interacoes = interacoes;
    }

    @Override
    public String exibir() {
        return "Story com interações: " + interacoes;
    }
}
