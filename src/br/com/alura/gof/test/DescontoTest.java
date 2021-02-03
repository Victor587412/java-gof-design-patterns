package br.com.alura.gof.test;

import br.com.alura.gof.desconto.CalculadoraDeDesconto;
import br.com.alura.gof.model.Orcamento;

import java.math.BigDecimal;

public class DescontoTest {

    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 2);
        Orcamento terceiro = new Orcamento(new BigDecimal("500"), 1);

        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
        System.out.println(calculadora.calcular(terceiro));
    }

}
