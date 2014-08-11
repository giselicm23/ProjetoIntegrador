/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.model;

import java.util.GregorianCalendar;

/**
 *
 * @author Familia
 */
public class Turma {

    private int id;
    private String cidadeDemandande;
    private String campusOfertante;
    private String nome;
    private String turno;
    private String aulasSemana;
    private String horarioAulas;
    private GregorianCalendar inicioAulas;
    private String localAulas;
    private boolean statusTurma;

    public Turma(String cidadeDemandande, String campusOfertante, String nome, String turno, String aulasSemana, String horarioAulas, GregorianCalendar inicioAulas, String localAulas) {
        this.cidadeDemandande = cidadeDemandande;
        this.campusOfertante = campusOfertante;
        this.nome = nome;
        this.turno = turno;
        this.aulasSemana = aulasSemana;
        this.horarioAulas = horarioAulas;
        this.inicioAulas = inicioAulas;
        this.localAulas = localAulas;
    }

    public String getCidadeDemandande() {
        return cidadeDemandande;
    }

    public void setCidadeDemandande(String cidadeDemandande) {
        this.cidadeDemandande = cidadeDemandande;
    }

    public String getCampusOfertante() {
        return campusOfertante;
    }

    public void setCampusOfertante(String campusOfertante) {
        this.campusOfertante = campusOfertante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getAulasSemana() {
        return aulasSemana;
    }

    public void setAulasSemana(String aulasSemana) {
        this.aulasSemana = aulasSemana;
    }

    public String getHorarioAulas() {
        return horarioAulas;
    }

    public void setHorarioAulas(String horarioAulas) {
        this.horarioAulas = horarioAulas;
    }

    public GregorianCalendar getInicioAulas() {
        return inicioAulas;
    }

    public void setInicioAulas(GregorianCalendar inicioAulas) {
        this.inicioAulas = inicioAulas;
    }

    public String getLocalAulas() {
        return localAulas;
    }

    public void setLocalAulas(String localAulas) {
        this.localAulas = localAulas;
    }

    public boolean isStatusTurma() {
        return statusTurma;
    }

    public void setStatusTurma(boolean statusTurma) {
        this.statusTurma = statusTurma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.id;
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
        final Turma other = (Turma) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
