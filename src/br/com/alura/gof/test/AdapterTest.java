package br.com.alura.gof.test;

import br.com.alura.gof.http.JavaHttpClient;
import br.com.alura.gof.model.Orcamento;
import br.com.alura.gof.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class AdapterTest {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.aprovar();

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
        registroDeOrcamento.registrar(orcamento);
    }

}
