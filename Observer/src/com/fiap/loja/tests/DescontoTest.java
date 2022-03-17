package com.fiap.loja.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import com.fiap.loja.Pedido;
import com.fiap.loja.desconto.CalculadoraDesconto;

class DescontoTest {

	// Desconto por valor
	@Test
	void deveRetornarDescontoParaPedidosComValorAcimaDe500() {
		Pedido pedido = new Pedido(new BigDecimal(600.0), 210);
		CalculadoraDesconto calculadora = new CalculadoraDesconto();
		BigDecimal descontoAplicado = calculadora.calcular(pedido);
	
		assertEquals(new BigDecimal("60.00"), descontoAplicado);
	}
	
	// Desconto por quantidade
	@Test
	void deveRetornarDescontoParaPedidosComMaisDe10Items() {
		Pedido pedido = new Pedido(new BigDecimal(100.0), 23);
		CalculadoraDesconto calculadora = new CalculadoraDesconto();
		BigDecimal descontoAplicado = calculadora.calcular(pedido);
	
		assertEquals(new BigDecimal("5.00"), descontoAplicado);
	}
	
	// Sem desconto
	@Test
	void deveRetornarSemDesconto() {
		Pedido pedido = new Pedido(new BigDecimal(10.0), 1);
		CalculadoraDesconto calculadora = new CalculadoraDesconto();
		BigDecimal descontoAplicado = calculadora.calcular(pedido);
	
		assertEquals(new BigDecimal("0.00"), descontoAplicado);
	}

}
