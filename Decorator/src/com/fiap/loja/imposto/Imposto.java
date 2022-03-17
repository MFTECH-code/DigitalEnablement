package com.fiap.loja.imposto;

import com.fiap.loja.Pedido;

import java.math.BigDecimal;

public abstract class Imposto {
	protected Imposto outroImposto;
	
	public Imposto(Imposto imposto) {
		super();
		this.outroImposto = imposto;
	}
	
    abstract BigDecimal calcular(Pedido pedido);
}
