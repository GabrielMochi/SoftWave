package br.net.softwave.client.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Comentario {
    
    private int id;
    private String texto;
    private int visible;
    private int comentador;
    private int blog_id;
    private int blog_areaConhecimento_id;
    private int receptor; // caso nulo, a mensagem será destinada para o blog

    public Comentario() {
    }

    public Comentario(int id, String texto, int visible, int comentador, int blog_id, int blog_areaConhecimento_id) {
        this.id = id;
        this.texto = texto;
        this.visible = visible;
        this.comentador = comentador;
        this.blog_id = blog_id;
        this.blog_areaConhecimento_id = blog_areaConhecimento_id;
    }

    public Comentario(int id, String texto, int visible, int comentador, int blog_id, int blog_areaConhecimento_id, int receptor) {
        this.id = id;
        this.texto = texto;
        this.visible = visible;
        this.comentador = comentador;
        this.blog_id = blog_id;
        this.blog_areaConhecimento_id = blog_areaConhecimento_id;
        this.receptor = receptor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }

    public int getComentador() {
        return comentador;
    }

    public void setComentador(int comentador) {
        this.comentador = comentador;
    }

    public int getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }

    public int getBlog_areaConhecimento_id() {
        return blog_areaConhecimento_id;
    }

    public void setBlog_areaConhecimento_id(int blog_areaConhecimento_id) {
        this.blog_areaConhecimento_id = blog_areaConhecimento_id;
    }

    public int getReceptor() {
        return receptor;
    }

    public void setReceptor(int receptor) {
        this.receptor = receptor;
    }

    @Override
    public String toString() {
        return "Comentario{" + "id=" + id + ", texto=" + texto + ", visible=" + visible + ", comentador=" + comentador + ", blog_id=" + blog_id + ", blog_areaConhecimento_id=" + blog_areaConhecimento_id + ", receptor=" + receptor + '}';
    }
    
}
