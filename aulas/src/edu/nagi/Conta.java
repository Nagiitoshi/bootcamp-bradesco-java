package edu.nagi;

public class Conta {

    protected String titular;
    protected int numeroConta;
    protected double saldoInicial = 0;

    public Conta(String titular, int numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldoInicial = saldoInicial;
    }

    public Object consultarSaldo() {
        return "Saldo: " + saldoInicial;
    }

    public boolean sacar(double valorSaque) {
        if (valorSaque > saldoInicial) {
            return false;
        }
        saldoInicial -= valorSaque;
        return true;

    }

    public void depositar(double valorDeposito) {
        saldoInicial += valorDeposito;

    }

}
