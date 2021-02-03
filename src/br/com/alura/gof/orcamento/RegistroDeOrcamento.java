package br.com.alura.gof.orcamento;

import br.com.alura.gof.http.HttpAdapter;
import br.com.alura.gof.model.Orcamento;
import br.com.alura.gof.situacao.SituacaoException;

import java.util.HashMap;
import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){
        if(!orcamento.isFinalizado()){
            throw new SituacaoException("Orcamento não finalizado");
        }
        String url = "http://apiexterna.com.br";
        Map<String, Object> values = new HashMap<>();
        values.put("valor", orcamento.getValor());

        http.post(url, values);
    }

}
