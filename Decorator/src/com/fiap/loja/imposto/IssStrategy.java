package com.fiap.loja.imposto;

import com.fiap.loja.Pedido;

import java.math.BigDecimal;

public class IssStrategy extends Imposto{
    public IssStrategy(Imposto imposto) {
		super(imposto);
	}

	@Override
    public BigDecimal calcular(Pedido pedido) {
		BigDecimal valorImposto = pedido.getValor().multiply(new BigDecimal(0.1));
		BigDecimal valorOutroImposto = BigDecimal.ZERO;
		
		if (outroImposto != null) {
			valorOutroImposto = outroImposto.calcular(pedido);
		}
		
        return valorImposto.add(valorOutroImposto);
    }
}
