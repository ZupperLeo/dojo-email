package br.com.zupacademy.email.kafka_listener.dto;

import br.com.zupacademy.email.kafka_listener.enums.Operadoras;

public class CelularDTO {

    private String numero;
    private Operadoras operadora;

    public CelularDTO(){
    }

    public CelularDTO(String numero, Operadoras operadora) {
        this.numero = numero;
        this.operadora = operadora;
    }

    public String getNumero() {
        return numero;
    }

    public Operadoras getOperadora() {
        return operadora;
    }
}
