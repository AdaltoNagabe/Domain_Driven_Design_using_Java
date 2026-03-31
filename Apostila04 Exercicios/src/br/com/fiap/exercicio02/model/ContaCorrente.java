package br.com.fiap.exercicio02.model;

public class ContaCorrente {

    public String titularCliente;
    public double saldoCliente = 0;

    public double depositaValor(double deposito){

        return (saldoCliente = saldoCliente + deposito);
    }
    public double retiraValor(double retirada){
        return (saldoCliente = saldoCliente - retirada);
    }
    public double retornaSaldo(){
        return saldoCliente;
    }
}
