package com.senac.canes.canes.controller;

import com.senac.canes.canes.model.Postagem;
import com.senac.canes.canes.model.Publicacao;
import com.senac.canes.canes.model.Reel;
import com.senac.canes.canes.model.Story;

public class Main {
    public static void main(String[] args) {
        Postagem post = new Reel("1 Minuto", "Reel do Joel");
        Postagem post2 = new Story("Story do Kevin");
        Postagem post3 = new Publicacao("Publi da Kerolaynne");

        System.out.println(post.exibir());
        System.out.println(post2.exibir());
        System.out.println(post3.exibir());
    }
}
