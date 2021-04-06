package br.com.apizup.transacao.eventotransacao;

import java.math.BigDecimal;

public class EventoDeTransacao {

	
	private String id;

    private BigDecimal valor;

	@Override
	public String toString() {
		return "EventoDeTransacao [id=" + id + ", valor=" + valor + "]";
	}

	public String getId() {
		return id;
	}

	public BigDecimal getValor() {
		return valor;
	}
    
    

}
