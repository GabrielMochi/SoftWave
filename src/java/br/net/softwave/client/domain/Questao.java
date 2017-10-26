package br.net.softwave.client.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Questao {

    private int id;
    private String pergunta;
    private Alternativa respostaCorreta;
    private int atividade_id;
    private int atividade_disciplina_id;
    private int atividade_disciplina_turma_numero;

    public Questao() {
    }

    public Questao(int id, String pergunta, Alternativa respostaCorreta, int atividade_id, int atividade_disciplina_id, int atividade_disciplina_turma_numero) {
        this.id = id;
        this.pergunta = pergunta;
        this.respostaCorreta = respostaCorreta;
        this.atividade_id = atividade_id;
        this.atividade_disciplina_id = atividade_disciplina_id;
        this.atividade_disciplina_turma_numero = atividade_disciplina_turma_numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public Alternativa getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(Alternativa respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    public int getAtividade_id() {
        return atividade_id;
    }

    public void setAtividade_id(int atividade_id) {
        this.atividade_id = atividade_id;
    }

    public int getAtividade_disciplina_id() {
        return atividade_disciplina_id;
    }

    public void setAtividade_disciplina_id(int atividade_disciplina_id) {
        this.atividade_disciplina_id = atividade_disciplina_id;
    }

    public int getAtividade_disciplina_turma_numero() {
        return atividade_disciplina_turma_numero;
    }

    public void setAtividade_disciplina_turma_numero(int atividade_disciplina_turma_numero) {
        this.atividade_disciplina_turma_numero = atividade_disciplina_turma_numero;
    }

    @Override
    public String toString() {
        return "Questao{" + "id=" + id + ", pergunta=" + pergunta + ", respostaCorreta=" + respostaCorreta + ", atividade_id=" + atividade_id + ", atividade_disciplina_id=" + atividade_disciplina_id + ", atividade_disciplina_turma_numero=" + atividade_disciplina_turma_numero + '}';
    }

    public enum Alternativa {
        A("A"), B("B"), C("C"), D("D"), E("E");

        private final String texto;

        private Alternativa(String texto) {
            this.texto = texto;
        }

        public String getTexto() {
            return texto;
        }

        @Override
        public String toString() {
            return "Alternativa{" + "texto=" + texto + '}';
        }

    }

}
