package br.com.alura.gof.pedido;

import br.com.alura.gof.model.Orcamento;
import br.com.alura.gof.model.Pedido;
import br.com.alura.gof.pedido.acao.AcaoAposGerarPedido;
import br.com.alura.gof.pedido.acao.EnviarEmailPedido;
import br.com.alura.gof.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public void executa(){
        Orcamento orcamento = new Orcamento();
        Pedido pedido = new Pedido(this.cliente, LocalDateTime.now(), orcamento);

        acoes.forEach(acaoAposGerarPedido -> acaoAposGerarPedido.executar(pedido));
    }
}
