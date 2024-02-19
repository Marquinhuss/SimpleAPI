package com.api1.api.Model;

import lombok.Data;

@Data
public class Produto {
    
    private Integer id;

    private String nome;

    private Long quantidade;

    private Double valor;

    private String observacao;

}
