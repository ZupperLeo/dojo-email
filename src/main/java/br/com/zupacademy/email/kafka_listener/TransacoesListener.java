package br.com.zupacademy.email.kafka_listener;

import br.com.zupacademy.email.kafka_listener.dto.TransacaoDTO;
import br.com.zupacademy.email.model.Email;
import br.com.zupacademy.email.repository.EmailRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class TransacoesListener {

    @Autowired
    private EmailRepository emailRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(TransacoesListener.class);

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    @Transactional
    public void ouvir(TransacaoDTO transacaoDTO) {
        System.out.println(transacaoDTO);

        LOGGER.info("teste");
        LOGGER.info(transacaoDTO.toString());

        //Email email = transacaoDTO.getEmail();
    }
}