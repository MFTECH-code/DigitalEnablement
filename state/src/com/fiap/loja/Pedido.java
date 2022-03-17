package com.fiap.loja;

import java.math.BigDecimal;

import com.fiap.loja.situacao.Aberto;
import com.fiap.loja.situacao.Situacao;

public class Pedido {
    private BigDecimal valor;
    private Integer items;
    private Situacao situacao;

    public Pedido(BigDecimal valor, Integer items) {
        this.valor = valor;
        this.items = items;
        this.situacao = new Aberto();
    }

    public Pedido(BigDecimal valor) {
        this.valor = valor;
        this.items = 1;
        this.situacao = new Aberto();
    }

    public Pedido() {
    }
    
    public void abrirChamado() {
    	situacao.abrirChamado();
    }
    
    public void pagar() throws Exception {
		situacao.pagar(this);
	}

	public void entregar() {
		situacao.entregar(this);
	}

	public void cancelar() {
		situacao.cancelar(this);
	}

	public void reabrir() {
		situacao.reabrir(this);
	}

	public BigDecimal getValor() {
        return valor;
    }

    public Integer getItems() {
        return items;
    }

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
    
    
}
