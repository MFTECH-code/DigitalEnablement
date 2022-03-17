package com.fiap.loja;

import java.math.BigDecimal;

public class Pedido {
    private BigDecimal valor;
    private Integer items;
    private String situacao;

    public Pedido(BigDecimal valor, Integer items) {
        this.valor = valor;
        this.items = items;
    }

    public Pedido(BigDecimal valor) {
        this.valor = valor;
        this.items = 1;
    }

    public Pedido() {
    }
    
    public void abrirChamado() {
    	if (situacao.equals("ABERTO")) {
    		System.out.println("Abrir chamado para FINANCEIRO");
    	} else if (situacao.equals("PAGO")) {
    		System.out.println("Abrir chamado para LOGISTICA");
    	} else if (situacao.equals("ENTREGUE")) {
    		System.out.println("Abrir chamado para POS-VENDA");
    	} else if (situacao.equals("CANCELADO")) {
    		System.out.println("Abrir chamado para COMERCIAL");
    	}
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getItems() {
        return items;
    }
}
