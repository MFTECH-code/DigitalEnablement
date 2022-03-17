package com.fiap.loja.desconto;

import com.fiap.loja.Pedido;

import java.math.BigDecimal;

public interface Desconto {
    BigDecimal calcular(Pedido pedido);
}
