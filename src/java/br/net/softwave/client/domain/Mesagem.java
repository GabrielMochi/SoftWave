package br.net.softwave.client.domain;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Mesagem {

    private String texto;
    private LocalDateTime enviada;
    private int recebida;
    private int trasmissor;
    private int receptor;

    public Mesagem() {
    }

    public Mesagem(String texto, LocalDateTime enviada, int recebida, int trasmissor, int receptor) {
        this.texto = texto;
        this.enviada = enviada;
        this.recebida = recebida;
        this.trasmissor = trasmissor;
        this.receptor = receptor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getEnviada() {
        return enviada;
    }

    public void setEnviada(LocalDateTime enviada) {
        this.enviada = enviada;
    }

    public int getRecebida() {
        return recebida;
    }

    public void setRecebida(int recebida) {
        this.recebida = recebida;
    }

    public int getTrasmissor() {
        return trasmissor;
    }

    public void setTrasmissor(int trasmissor) {
        this.trasmissor = trasmissor;
    }

    public int getReceptor() {
        return receptor;
    }

    public void setReceptor(int receptor) {
        this.receptor = receptor;
    }

    @Override
    public String toString() {
        return "Mesagem{" + "texto=" + texto + ", enviada=" + enviada + ", recebida=" + recebida + ", trasmissor=" + trasmissor + ", receptor=" + receptor + '}';
    }
    
    
}
