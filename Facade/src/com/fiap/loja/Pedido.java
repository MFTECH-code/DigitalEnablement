package com.fiap.loja;

import java.math.BigDecimal;

import com.fiap.loja.situacao.Aberto;
import com.fiap.loja.situacao.Situacao;
import com.fiap.loja.situacao.SituacaoHandler;

public class Pedido {
    private BigDecimal valor;
    private Integer items;
    private Situacao situacao;
    private SituacaoHandler handler;

    public Pedido(BigDecimal valor, Integer items) {
        this.valor = valor;
        this.items = items;
        this.situacao = new Aberto();
        this.handler = new SituacaoHandler();
        
        PedidoFacade.criarProduto();
    }

    public Pedido(BigDecimal valor) {
        this.valor = valor;
        this.items = 1;
        this.situacao = new Aberto();
        this.handler = new SituacaoHandler();
        PedidoFacade.criarProduto();
    }

    public Pedido() {
    	PedidoFacade.criarProduto();
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
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
		handler.notificar(this);
	}

	public SituacaoHandler getHandler() {
		return handler;
	}

	public void setHandler(SituacaoHandler handler) {
		this.handler = handler;
	}
	
	
    
    
}
