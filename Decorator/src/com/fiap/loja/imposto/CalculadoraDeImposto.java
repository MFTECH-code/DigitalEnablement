package com.fiap.loja.imposto;

import com.fiap.loja.Pedido;

import java.math.BigDecimal;

public class CalculadoraDeImposto {

    private Imposto imposto;

    public CalculadoraDeImposto(Imposto imposto) {
        this.imposto = imposto;
    }
    
    public CalculadoraDeImposto() {
    }

    public BigDecimal calcular(Pedido pedido) {
        return imposto.calcular(pedido);
    }

    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }
}
