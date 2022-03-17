package com.fiap.loja.desconto;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.fiap.loja.Pedido;

public class CalculadoraDesconto {
	public BigDecimal calcular(Pedido pedido) {
		Desconto desc = new DescontoPorValor(new DescontoPorValor(new DescontoPorQuantidade(new SemDesconto())));
		return desc.calcular(pedido).setScale(2, RoundingMode.HALF_UP);		
	}
}
