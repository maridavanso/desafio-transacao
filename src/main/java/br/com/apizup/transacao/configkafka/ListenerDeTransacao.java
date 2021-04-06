package br.com.apizup.transacao.configkafka;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.com.apizup.transacao.eventotransacao.EventoDeTransacao;

@Component
public class ListenerDeTransacao {
	
	@PersistenceContext
    private EntityManager entityManager;

	@Transactional
	@KafkaListener(topics = "${spring.kafka.topic.transactions}")
	public void ouvir(EventoDeTransacao eventoDeTransacao) {
		System.out.println(eventoDeTransacao);
	}

}