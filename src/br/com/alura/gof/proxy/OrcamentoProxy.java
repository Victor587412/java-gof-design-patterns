package br.com.alura.gof.proxy;

import br.com.alura.gof.model.Orcamento;

import java.math.BigDecimal;
import java.util.Objects;

public class OrcamentoProxy {

    private BigDecimal valor;
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public BigDecimal getValor() {
        if(Objects.isNull(valor)){
            this.valor = orcamento.getValor();
        }
        return valor;
    }
}
