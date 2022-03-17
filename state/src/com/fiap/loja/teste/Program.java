package com.fiap.loja.teste;

import java.math.BigDecimal;

import com.fiap.loja.Pedido;

public class Program {

	public static void main(String[] args) throws Exception {
		Pedido pedido = new Pedido(new BigDecimal(100));
		
		pedido.pagar();
		pedido.abrirChamado();
		
		pedido.entregar();
		pedido.abrirChamado();
		
		pedido.reabrir();
		pedido.abrirChamado();
		
		pedido.cancelar();
		pedido.abrirChamado();
		
	}

}
