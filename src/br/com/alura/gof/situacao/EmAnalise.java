package br.com.alura.gof.situacao;

import br.com.alura.gof.model.Orcamento;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento{

    @Override
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }

    @Override
    public void aprovar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }

}
