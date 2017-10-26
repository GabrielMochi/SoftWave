package br.net.softwave.client.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Turma {
    
    private int numero;
    private String nome;

    public Turma() {
    }

    public Turma(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Turma{" + "numero=" + numero + ", nome=" + nome + '}';
    }
    
}
