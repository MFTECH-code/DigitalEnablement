package com.fiap.loja.situacao;

import com.fiap.loja.Pedido;

public abstract class Situacao {
	
	public abstract void abrirChamado();
	
	public void pagar(Pedido pedido) throws Exception {
		throw new StateException("Não pode trocar para o estado pago...");
	}
	
	public void entregar(Pedido pedido) {
		throw new StateException("Não pode trocar para o estado entregue...");
	}
	
	public void cancelar(Pedido pedido) {
		throw new StateException("Não pode trocar para o estado cancelado...");
	}
	
	public void reabrir(Pedido pedido) {
		throw new StateException("Não pode trocar para o estado aberto...");
	}
}
