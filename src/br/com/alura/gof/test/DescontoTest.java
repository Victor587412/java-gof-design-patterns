package br.com.alura.gof.test;

import br.com.alura.gof.desconto.CalculadoraDeDesconto;
import br.com.alura.gof.model.Orcamento;

import java.math.BigDecimal;

public class DescontoTest {

    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento();
        Orcamento segundo = new Orcamento();
        Orcamento terceiro = new Orcamento();

        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
        System.out.println(calculadora.calcular(terceiro));
    }

}
