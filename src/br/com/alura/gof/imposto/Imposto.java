package br.com.alura.gof.imposto;

import br.com.alura.gof.model.Orcamento;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;

public abstract class Imposto {

    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento){
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal outroImposto = BigDecimal.ZERO;
        if(Objects.nonNull(outro)){
            outroImposto = outro.realizarCalculo(orcamento);
        }
        return valorImposto.add(outroImposto);
    }

}
