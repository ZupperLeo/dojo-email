package br.com.zupacademy.email.kafka_listener.dto;

import br.com.zupacademy.email.kafka_listener.enums.TipoOperacao;
import br.com.zupacademy.email.model.Email;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoDTO {

    private TipoOperacao tipo;
    private BigDecimal valor;
    private LocalDateTime data = LocalDateTime.now();
    private ContaDTO conta;
    private CelularDTO celular = null;

    public TransacaoDTO(){
    }

    public TransacaoDTO(TipoOperacao tipo, BigDecimal valor, ContaDTO conta) {
        this.tipo = tipo;
        this.valor = valor;
        this.conta = conta;
    }

    public TransacaoDTO(TipoOperacao tipo, BigDecimal valor, ContaDTO conta, CelularDTO celular) {
        this.tipo = tipo;
        this.valor = valor;
        this.conta = conta;
        this.celular = celular;
    }

    public TipoOperacao getTipo() {
        return tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public ContaDTO getConta() {
        return conta;
    }

    public CelularDTO getCelular() {
        return celular;
    }

    public Email getEmail(){
        return this.tipo.getEmail(this);
    }
}
