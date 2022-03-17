package com.fiap.loja;

import java.math.BigDecimal;

public class Pedido {
    private BigDecimal valor;
    private Integer items;

    public Pedido(BigDecimal valor, Integer items) {
        this.valor = valor;
        this.items = items;
    }

    public Pedido(BigDecimal valor) {
        this.valor = valor;
        this.items = 1;
    }

    public Pedido() {
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getItems() {
        return items;
    }
}
