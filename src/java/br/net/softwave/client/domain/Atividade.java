package br.net.softwave.client.domain;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Atividade {
    
    private int id;
    private String descricao;
    private LocalDateTime lancada;
    private int disciplina_id;
    private int disciplina_turma_numero;

    public Atividade() {
    }

    public Atividade(int id, String descricao, LocalDateTime lancada, int disciplina_id, int disciplina_turma_numero) {
        this.id = id;
        this.descricao = descricao;
        this.lancada = lancada;
        this.disciplina_id = disciplina_id;
        this.disciplina_turma_numero = disciplina_turma_numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getLancada() {
        return lancada;
    }

    public void setLancada(LocalDateTime lancada) {
        this.lancada = lancada;
    }

    public int getDisciplina_id() {
        return disciplina_id;
    }

    public void setDisciplina_id(int disciplina_id) {
        this.disciplina_id = disciplina_id;
    }

    public int getDisciplina_turma_numero() {
        return disciplina_turma_numero;
    }

    public void setDisciplina_turma_numero(int disciplina_turma_numero) {
        this.disciplina_turma_numero = disciplina_turma_numero;
    }

    @Override
    public String toString() {
        return "Atividade{" + "id=" + id + ", descricao=" + descricao + ", lancada=" + lancada + ", disciplina_id=" + disciplina_id + ", disciplina_turma_numero=" + disciplina_turma_numero + '}';
    }
    
}
