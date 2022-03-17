package com.fiap.loja.situacao;

import com.fiap.loja.Pedido;

public class Entregue extends Situacao {

	@Override
	public void abrirChamado() {
		System.out.println("Abrir chamado para POS-VENDA");	
	}

	@Override
	public void reabrir(Pedido pedido) {
		pedido.setSituacao(new Aberto());
	}
	
}
