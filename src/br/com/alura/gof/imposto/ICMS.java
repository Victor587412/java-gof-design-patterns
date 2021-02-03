package br.com.alura.gof.imposto;

import br.com.alura.gof.model.Orcamento;

import java.math.BigDecimal;

public class ICMS implements Imposto{
    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
