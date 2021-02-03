package br.com.alura.gof.pedido.acao;

import br.com.alura.gof.model.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executar(Pedido pedido){
        System.out.println("Enviando dados com dados do pedido!!");
    }

}
