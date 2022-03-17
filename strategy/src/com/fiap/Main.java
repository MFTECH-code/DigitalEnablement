package com.fiap;

import com.fiap.loja.Pedido;
import com.fiap.loja.imposto.CalculadoraDeImposto;
import com.fiap.loja.imposto.IcmsStrategy;
import com.fiap.loja.imposto.IssStrategy;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido(new BigDecimal(100));
        CalculadoraDeImposto calcImposto = new CalculadoraDeImposto(new IcmsStrategy());
        BigDecimal valorImposto = calcImposto.calcular(pedido);
        System.out.println(valorImposto); // Valor do imposto
        calcImposto.setImposto(new IssStrategy());
        valorImposto = calcImposto.calcular(pedido);
        System.out.println(valorImposto);
    }
}
