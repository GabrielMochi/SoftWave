package br.net.softwave.client.util;

public class URLController {
    
    private String URL;

    public URLController(String URL) {
        this.URL = URL;
    }
    
    public String salvar() {
        return URL + "salvar/";
    }
    
    public String alterar() {
        return URL + "alterar/";
    }
    
    public String pegarTodos() {
        return URL + "pegarTodos/";
    }
    
    public String pegar(String id) {
        return URL + "pegar/" + id + "/";
    }
    
    public String remover(String id) {
        return URL + "remover/" + id + "/";
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public String toString() {
        return "URLController{" + "URL=" + URL + '}';
    }
    
}
