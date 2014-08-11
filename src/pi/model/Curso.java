/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.model;

/**
 *
 * @author Familia
 */
public class Curso {

    private int id;
    private String nome;
    private String descricao;
    private String eixoTecnologico;
    private String cargaHoraria;

    public Curso(String nome, String descricao, String eixoTecnologico, String cargaHoraria) {
        this.nome = nome;
        this.descricao = descricao;
        this.eixoTecnologico = eixoTecnologico;
        this.cargaHoraria = cargaHoraria;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEixoTecnologico() {
        return eixoTecnologico;
    }

    public void setEixoTecnologico(String eixoTecnologico) {
        this.eixoTecnologico = eixoTecnologico;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
