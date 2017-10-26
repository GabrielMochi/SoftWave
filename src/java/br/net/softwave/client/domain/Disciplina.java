package br.net.softwave.client.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Disciplina {
    
    private int id;
    private String nome;
    private int turma_numero;

    public Disciplina() {
    }

    public Disciplina(int id, String nome, int turma_numero) {
        this.id = id;
        this.nome = nome;
        this.turma_numero = turma_numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTurma_numero() {
        return turma_numero;
    }

    public void setTurma_numero(int turma_numero) {
        this.turma_numero = turma_numero;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "id=" + id + ", nome=" + nome + ", turma_numero=" + turma_numero + '}';
    }
    
}
