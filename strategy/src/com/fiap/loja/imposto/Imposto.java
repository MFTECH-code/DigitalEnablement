package com.fiap.loja.imposto;

import com.fiap.loja.Pedido;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Pedido pedido);
}
