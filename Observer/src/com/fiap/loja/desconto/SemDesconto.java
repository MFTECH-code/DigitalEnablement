package com.fiap.loja.desconto;

import java.math.BigDecimal;

import com.fiap.loja.Pedido;

public class SemDesconto extends Desconto {
	
	public SemDesconto() {
		super(null);
	}

	@Override
	public boolean deveAplicar(Pedido pedido) {
		return true;
	}

	@Override
	public BigDecimal aplicarDesconto(Pedido pedido) {
		return BigDecimal.ZERO;
	}
}
