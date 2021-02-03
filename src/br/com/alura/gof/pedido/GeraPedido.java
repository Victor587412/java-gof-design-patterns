package br.com.alura.gof.pedido;

import br.com.alura.gof.model.Orcamento;
import br.com.alura.gof.model.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public void executa(){
        Orcamento orcamento = new Orcamento(valorOrcamento,quantidadeItens);
        Pedido pedido = new Pedido(this.cliente, LocalDateTime.now(), orcamento);
    }
}
