package br.com.alura.gof.test;

import br.com.alura.gof.model.Orcamento;
import br.com.alura.gof.model.OrcamentoItem;
import br.com.alura.gof.proxy.OrcamentoProxy;

import java.math.BigDecimal;

public class ProxyTest {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItens(new OrcamentoItem(new BigDecimal("1000")));
        OrcamentoProxy orcamentoProxy = new OrcamentoProxy(orcamento);
        System.out.println(orcamentoProxy.getValor());
        System.out.println(orcamentoProxy.getValor());
        System.out.println(orcamentoProxy.getValor());
        System.out.println(orcamentoProxy.getValor());
    }

}
