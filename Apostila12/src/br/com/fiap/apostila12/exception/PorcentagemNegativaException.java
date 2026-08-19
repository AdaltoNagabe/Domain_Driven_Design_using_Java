package br.com.fiap.apostila12.exception;

public class PorcentagemNegativaException extends Exception{

    public PorcentagemNegativaException() {
        super("A porcentagem não pode ser negativa.");
    }



}
