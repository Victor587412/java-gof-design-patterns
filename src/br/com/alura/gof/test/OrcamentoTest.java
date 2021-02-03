package br.com.alura.gof.test;

import br.com.alura.gof.model.Orcamento;
import br.com.alura.gof.model.OrcamentoItem;

import java.math.BigDecimal;

public class OrcamentoTest {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItens(new OrcamentoItem(new BigDecimal("1000")));

        Orcamento orcamentoNovo = new Orcamento();
        orcamentoNovo.adicionarItens(new OrcamentoItem(new BigDecimal("100")));
        orcamentoNovo.adicionarItens(orcamento);
        System.out.println(orcamentoNovo.getValor());
    }
}
