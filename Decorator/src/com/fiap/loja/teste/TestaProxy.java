package com.fiap.loja.teste;

import java.math.BigDecimal;

import com.fiap.loja.Pedido;
import com.fiap.loja.PedidoProxy;
import com.fiap.loja.situacao.EmailListener;
import com.fiap.loja.situacao.LogListener;

public class TestaProxy {

	public static void main(String[] args) {
		Pedido pedido = new PedidoProxy(new Pedido(new BigDecimal(100)));
		
		pedido.getHandler().increver(new EmailListener());
		pedido.getHandler().increver(new LogListener());
		
		System.out.println(pedido.getValor());

		try {
			pedido.pagar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		pedido.entregar();
		
	}

}
