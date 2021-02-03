package br.com.alura.gof.http;

import java.util.Map;

public interface HttpAdapter {

    void post(String url, Map<String, Object> dados);

}
