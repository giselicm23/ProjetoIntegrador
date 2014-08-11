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
public class Aluno {

    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private Endereco endereco;
    private ContaBancaria contaBancaria;
    private GregorianCalendar dataNascimento;
    private String escolaridade;
    private String observações;
    private boolean statusAluno;

    public Aluno(String nome, String rg, String telefone, Endereco endereco, ContaBancaria contaBancaria, GregorianCalendar dataNascimento, String escolaridade) {
        this.nome = nome;
        this.rg = rg;
        this.telefone = telefone;
        this.endereco = endereco;
        this.contaBancaria = contaBancaria;
        this.dataNascimento = dataNascimento;
        this.escolaridade = escolaridade;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public GregorianCalendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(GregorianCalendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getObservações() {
        return observações;
    }

    public void setObservações(String observações) {
        this.observações = observações;
    }

    public boolean isStatusAluno() {
        return statusAluno;
    }

    public void setStatusAluno(boolean statusAluno) {
        this.statusAluno = statusAluno;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
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
        final Aluno other = (Aluno) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
