package com.fiap.loja.situacao;

import java.util.ArrayList;
import java.util.List;

import com.fiap.loja.Pedido;

public class SituacaoHandler {
	private List<SituacaoListener> inscritos = new ArrayList<>();
	
	public void increver(SituacaoListener inscrito) {
		inscritos.add(inscrito);
	}
	
	public void remover(SituacaoListener inscrito) {
		inscritos.remove(inscrito);
	}
	
	public void notificar(Pedido pedido) {
		inscritos.forEach(inscrito -> inscrito.atualizar(pedido));
	}
}
