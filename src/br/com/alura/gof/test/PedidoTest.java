package br.com.alura.gof.test;

import br.com.alura.gof.model.Orcamento;
import br.com.alura.gof.model.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PedidoTest {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        Pedido pedido = new Pedido("Victor Gabriel", LocalDateTime.now(), orcamento);
    }
}
