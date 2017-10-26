package br.net.softwave.client.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Usuario_has_Turma {
    
    private int usuario_prontuario;
    private int turma_numero;

    public Usuario_has_Turma() {
    }

    public Usuario_has_Turma(int usuario_prontuario, int turma_numero) {
        this.usuario_prontuario = usuario_prontuario;
        this.turma_numero = turma_numero;
    }

    public int getUsuario_prontuario() {
        return usuario_prontuario;
    }

    public void setUsuario_prontuario(int usuario_prontuario) {
        this.usuario_prontuario = usuario_prontuario;
    }

    public int getTurma_numero() {
        return turma_numero;
    }

    public void setTurma_numero(int turma_numero) {
        this.turma_numero = turma_numero;
    }

    @Override
    public String toString() {
        return "Usuario_has_Turma{" + "usuario_prontuario=" + usuario_prontuario + ", turma_numero=" + turma_numero + '}';
    }
    
}
