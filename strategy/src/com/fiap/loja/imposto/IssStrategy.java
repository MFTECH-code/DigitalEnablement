package com.fiap.loja.imposto;

import com.fiap.loja.Pedido;

import java.math.BigDecimal;

public class IssStrategy implements Imposto{
    @Override
    public BigDecimal calcular(Pedido pedido) {
        return pedido.getValor().multiply(new BigDecimal(0.1));
    }
}
