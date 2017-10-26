package br.net.softwave.client.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Blog {
    
    private int id;
    private String titulo;
    private int visible;
    private int usuario_prontuario;
    private int areaConhecimento_id;

    public Blog() {
    }

    public Blog(int id, String titulo, int visible, int usuario_prontuario, int areaConhecimento_id) {
        this.id = id;
        this.titulo = titulo;
        this.visible = visible;
        this.usuario_prontuario = usuario_prontuario;
        this.areaConhecimento_id = areaConhecimento_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }

    public int getUsuario_prontuario() {
        return usuario_prontuario;
    }

    public void setUsuario_prontuario(int usuario_prontuario) {
        this.usuario_prontuario = usuario_prontuario;
    }

    public int getAreaConhecimento_id() {
        return areaConhecimento_id;
    }

    public void setAreaConhecimento_id(int areaConhecimento_id) {
        this.areaConhecimento_id = areaConhecimento_id;
    }

    @Override
    public String toString() {
        return "Blog{" + "id=" + id + ", titulo=" + titulo + ", visible=" + visible + ", usuario_prontuario=" + usuario_prontuario + ", areaConhecimento_id=" + areaConhecimento_id + '}';
    }
    
}
