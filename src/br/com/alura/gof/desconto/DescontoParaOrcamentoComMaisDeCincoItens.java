package br.com.alura.gof.desconto;

import br.com.alura.gof.model.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto{

    public DescontoParaOrcamentoComMaisDeCincoItens(Desconto desconto) {
        super(desconto);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getItens().size() > 5;
    }


}
