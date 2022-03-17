package com.fiap.loja.teste;

import com.fiap.loja.Pedido;
import com.fiap.loja.PedidoProxy;
import com.fiap.loja.imposto.CalculadoraDeImposto;
import com.fiap.loja.imposto.IcmsStrategy;
import com.fiap.loja.imposto.IssStrategy;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Pedido pedido = new PedidoProxy(new Pedido(new BigDecimal(100)));
        CalculadoraDeImposto calcImposto = new CalculadoraDeImposto(new IcmsStrategy(new IssStrategy(null)));
        
        BigDecimal valorImposto = calcImposto.calcular(pedido);
        
        System.out.println(valorImposto); // Valor do imposto
        calcImposto.setImposto(new IssStrategy(null));
        valorImposto = calcImposto.calcular(pedido);
        System.out.println(valorImposto);
    }
}
