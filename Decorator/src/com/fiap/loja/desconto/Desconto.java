package com.fiap.loja.desconto;

import java.math.BigDecimal;

import com.fiap.loja.Pedido;

public abstract class Desconto {
	
	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public final BigDecimal calcular(Pedido pedido) {
		return deveAplicar(pedido) ? aplicarDesconto(pedido) : proximo.calcular(pedido);
	}
	
	public abstract boolean deveAplicar(Pedido pedido);
	
	public abstract BigDecimal aplicarDesconto(Pedido pedido);
}
