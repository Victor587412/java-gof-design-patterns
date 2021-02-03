package br.com.alura.gof.situacao;

import br.com.alura.gof.model.Orcamento;

public class Reprovado extends SituacaoOrcamento{

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
