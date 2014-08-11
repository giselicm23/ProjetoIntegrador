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
public class ContaBancaria {

    private String banco;
    private int agencia;
    private long numeroConta;

    public ContaBancaria(String banco, int agencia, long numeroConta) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

}
