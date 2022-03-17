package com.fiap.loja.desconto;

import java.math.BigDecimal;

import com.fiap.loja.Pedido;

public class DescontoPorQuantidade extends Desconto {

	public DescontoPorQuantidade(Desconto proximo) {
		super(proximo);
	}

	@Override
	public boolean deveAplicar(Pedido pedido) {
		return pedido.getItems() > 10;
	}

	@Override
	public BigDecimal aplicarDesconto(Pedido pedido) {
		return pedido.getValor().multiply(new BigDecimal(0.05));
	}
}
