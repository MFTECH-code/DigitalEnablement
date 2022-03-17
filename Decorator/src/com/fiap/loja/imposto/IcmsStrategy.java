package com.fiap.loja.imposto;

import com.fiap.loja.Pedido;

import java.math.BigDecimal;

public class IcmsStrategy extends Imposto{
	
    public IcmsStrategy(Imposto imposto) {
		super(imposto);
	}

	@Override
    public BigDecimal calcular(Pedido pedido) {
		BigDecimal valorImposto = pedido.getValor().multiply(new BigDecimal(0.05));
		BigDecimal valorOutroImposto = BigDecimal.ZERO;
		
		if (outroImposto != null) {
			valorOutroImposto = outroImposto.calcular(pedido);
		}
		
        return valorImposto.add(valorOutroImposto);
    }
}
