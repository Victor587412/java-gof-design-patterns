package br.com.alura.gof.pedido.acao;

import br.com.alura.gof.model.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    public void executar(Pedido pedido){
        System.out.println("Salvando dados com dados do pedido!!");
    }

}
