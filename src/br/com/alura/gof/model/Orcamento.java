package br.com.alura.gof.model;


import br.com.alura.gof.orcamento.Orcavel;
import br.com.alura.gof.situacao.EmAnalise;
import br.com.alura.gof.situacao.Finalizado;
import br.com.alura.gof.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel {

    private BigDecimal valor;
    private SituacaoOrcamento situacao;
    private List<Orcavel> itens;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra(){
        BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void adicionarItens(Orcavel orcavel){
        this.valor = this.valor.add(orcavel.getValor());
        this.itens.add(orcavel);
    }

    public List<Orcavel> getItens() {
        return itens;
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
    }

    public BigDecimal getValor() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return valor;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }
    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public boolean isFinalizado() {
        return situacao instanceof Finalizado;
    }
}
