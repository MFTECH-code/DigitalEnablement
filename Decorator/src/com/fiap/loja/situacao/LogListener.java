package com.fiap.loja.situacao;

import com.fiap.loja.Pedido;

public class LogListener implements SituacaoListener {

	@Override
	public void atualizar(Pedido pedido) {
		System.out.println("LOG: " + pedido + " mudou de situação e o valor dele é de R$" + pedido.getValor());
	}

}
