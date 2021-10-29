package com.ps.enewsapi.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Publicacao {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private String titulo;

    private String subtitulo;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    private String hashtag;

    private byte[] imagem;

    private String tipo;
}
