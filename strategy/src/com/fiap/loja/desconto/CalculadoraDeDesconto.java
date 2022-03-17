package com.fiap.loja.desconto;

import com.fiap.loja.Pedido;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {
    private Desconto desconto;

    public BigDecimal calcular(Pedido pedido) {
        return desconto.calcular(pedido);
    }
}
