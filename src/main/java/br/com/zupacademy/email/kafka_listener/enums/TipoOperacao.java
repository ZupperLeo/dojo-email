package br.com.zupacademy.email.kafka_listener.enums;

import br.com.zupacademy.email.kafka_listener.dto.TransacaoDTO;
import br.com.zupacademy.email.model.Email;

public enum TipoOperacao {
    PAGAMENTO_BOLETO {
        public Email getEmail(TransacaoDTO transacao){
            String recebedor = transacao.getConta().getCliente().getEmail();
            String assunto = "Pagamento de boleto";
            String mensagem = "Olá " +  transacao.getConta().getCliente().getNome() + "\r\n" +
                              "Pagamento de boleto no valor de R$" + transacao.getValor() + " efetuado pela conta " + transacao.getConta().getNumero();

            return new Email(recebedor, assunto, mensagem);
        }
    },
    RECARGA_CELULAR {
        public Email getEmail(TransacaoDTO transacao){
            String recebedor = transacao.getConta().getCliente().getEmail();
            String assunto = "Recarga de celular";
            String mensagem = "Olá " +  transacao.getConta().getCliente().getNome() + "\r\n" +
                    "Regarga de celular no valor de R$" + transacao.getValor() + " efetuado pela conta " + transacao.getConta().getNumero()+ "\r\n" +
                    "Celular: "+ transacao.getCelular().getNumero() + "\r\n" +
                    "Operadora: "+ transacao.getCelular().getOperadora();

            return new Email(recebedor, assunto, mensagem);
        }
    },
    DEPOSITO {
        public Email getEmail(TransacaoDTO transacao){
            String recebedor = transacao.getConta().getCliente().getEmail();
            String assunto = "Recarga de celular";
            String mensagem = "Olá " +  transacao.getConta().getCliente().getNome() + "\r\n" +
                    "Depósito no valor de R$" + transacao.getValor() + " efetuado na conta " + transacao.getConta().getNumero();

            return new Email(recebedor, assunto, mensagem);
        }
    },
    SAQUE {
        public Email getEmail(TransacaoDTO transacao){
            String recebedor = transacao.getConta().getCliente().getEmail();
            String assunto = "Recarga de celular";
            String mensagem = "Olá " +  transacao.getConta().getCliente().getNome() + "\r\n" +
                    "Saque no valor de R$" + transacao.getValor() + " efetuado na conta " + transacao.getConta().getNumero();

            return new Email(recebedor, assunto, mensagem);
        }
    };

    abstract public Email getEmail(TransacaoDTO transacao);
}
