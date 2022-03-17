package com.fiap.loja.desconto;
import java.math.BigDecimal;
import com.fiap.loja.Pedido;

public class DescontoPorValor extends Desconto {

	public DescontoPorValor(Desconto proximo) {
		super(proximo);
	}

	@Override
	public boolean deveAplicar(Pedido pedido) {
		return pedido.getValor().compareTo(new BigDecimal(500)) > 0;
	}

	@Override
	public BigDecimal aplicarDesconto(Pedido pedido) {
		return pedido.getValor().multiply(new BigDecimal(0.1));
	}
}
