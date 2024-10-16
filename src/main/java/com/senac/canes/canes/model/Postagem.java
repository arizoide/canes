package com.senac.canes.canes.model;

public abstract class Postagem {
    private String curtida;
    private String comentario;
    private String midia;

    public Postagem(String curtida, String comentario, String midia) {
        this.curtida = curtida;
        this.comentario = comentario;
        this.midia = midia;
    }

    public Postagem() {
    }

    public abstract String exibir();
}
