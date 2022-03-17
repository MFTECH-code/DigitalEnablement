package com.fiap.loja.situacao;

import com.fiap.loja.Pedido;

public class EmailListener implements SituacaoListener{

	@Override
	public void atualizar(Pedido pedido) {
		System.out.println("Mandando email para o pedido " + pedido + 
				" na situa��o " + pedido.getSituacao());
	}

}
