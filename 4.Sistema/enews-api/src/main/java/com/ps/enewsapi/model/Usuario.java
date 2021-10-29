package com.ps.enewsapi.model;

import lombok.Data;


import javax.persistence.*;
import java.util.Date;


import static javax.persistence.TemporalType.TIMESTAMP;
@Entity
@Data
public class Usuario {

    private static final long serialVersionUID = 4963522753959149188L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private String senha;

    @Basic(fetch = FetchType.LAZY)
    @Lob
    private byte[] imagem;

    @Temporal(TIMESTAMP)
    private Date data_nasc;

    @Column(nullable = false)
    private boolean status;

    @Temporal(TIMESTAMP)
    private Date ultimoLogin;

    @Column(nullable = false)
    private boolean estaLogado;

    private String cnpj;

    private String nomeEmpresa;

}
