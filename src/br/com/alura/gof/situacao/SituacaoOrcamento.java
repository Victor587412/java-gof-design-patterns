package br.com.alura.gof.situacao;

import br.com.alura.gof.model.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public void aprovar(Orcamento orcamento){
        throw new SituacaoException("Não é possivel aprovar o orçamento");
    }

    public void reprovar(Orcamento orcamento){
        throw new SituacaoException("Não é possivel reprovar o orçamento");
    }

    public void finalizar(Orcamento orcamento){
        throw new SituacaoException("Não é possivel finalizar o orçamento");
    }

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

}
