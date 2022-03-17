package com.fiap.loja.imposto;

import com.fiap.loja.Pedido;

import java.math.BigDecimal;

public class IcmsStrategy implements Imposto{
    @Override
    public BigDecimal calcular(Pedido pedido) {
        return pedido.getValor().multiply(new BigDecimal(0.05));
    }
}
