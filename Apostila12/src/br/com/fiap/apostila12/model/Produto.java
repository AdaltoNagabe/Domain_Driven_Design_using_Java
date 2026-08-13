package br.com.fiap.apostila12.model;

public class Produto {

    private String nome;
    private double preco;

    public double darDesconto(double desconto){
        //Validar se o desconto e maior que o preco
        if (desconto >= preco) {
            throw new RuntimeException("Valor do desconto invalido!");
        }
        //Validar se o desconto e positivo
        if (desconto < 0) {
            throw new RuntimeException("Valores negativos nao sao permitibo!");
        }
        return preco - desconto;
    }

    public Produto(){}

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
