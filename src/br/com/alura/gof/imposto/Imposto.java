package br.com.alura.gof.imposto;

import br.com.alura.gof.model.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);

}
