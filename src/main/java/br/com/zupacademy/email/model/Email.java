package br.com.zupacademy.email.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String recebedor;
    private String assunto;
    @Lob
    private String mensagem;

    private LocalDateTime criadoEm = LocalDateTime.now();

    public Email(){
    }

    public Email(String recebedor, String assunto, String mensagem) {
        this.recebedor = recebedor;
        this.assunto = assunto;
        this.mensagem = mensagem;
    }

    public Long getId() {
        return id;
    }

    public String getRecebedor() {
        return recebedor;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    @Override
    public String toString() {
        return "Email{" + "\r\n" +
                "Para: " + recebedor + "\r\n" +
                "Assunto: " + assunto + "\r\n" +
                "Mensagem: " + mensagem + "}";
    }
}
