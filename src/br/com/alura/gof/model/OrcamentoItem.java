package br.com.alura.gof.model;

import br.com.alura.gof.orcamento.Orcavel;

import java.math.BigDecimal;

public class OrcamentoItem implements Orcavel {

    public OrcamentoItem(BigDecimal valor) {
        this.valor = valor;
    }

    private BigDecimal valor;

    public BigDecimal getValor() {
        return valor;
    }
}
