package br.com.fiap.loja.model;

public class Produto {

    private String nome;
    private double preco;
    private String codigoBarra;

    public Produto(String nome, double preco, String codigoBarra) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarra = codigoBarra;
    }

    //Calculo valor final com desconto em % de desconto
    public double calcularDesconto(int porcentagem){
        return preco - preco * porcentagem / 100;
    }

    //Calculo valor final com desconto em valor absoluto R$
    public double calcularDesconto(float valor){
        return preco - valor;
    }

    //Criar uma sobrecarga para receber um cupom de desconto
    //FIAP20 -> 20%, FIAP30 -> 30%
    public double calcularDesconto(String cupom){
        int porcentagem = 0;

        if (cupom.equals("FIAP20")) {
            porcentagem = 20;

        } else if (cupom.equals("FIAP30")) {
            porcentagem = 30;

        }
        return calcularDesconto(porcentagem);
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

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }
}
