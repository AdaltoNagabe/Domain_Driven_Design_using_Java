package br.com.fiap.loja.model;

public class Produto {

    //public = modificador de acesso, deixando disponivel para todos o atributo
    public double preco;
    public int codigo;
    public String nomeProduto;
    public boolean disponivel;
    public Fornecedor nomefornecedor;

    //Metodos (São as ações que os atributos podem executar) - Nota: Sempre um verbo
    //Desconto
    public double calcularDesconto(){
        double desconto = preco * 0.2;
        return desconto;
    }
    //Acrescimo preco
    public void aumentarPreco(double porcentagem){
        preco += preco * porcentagem / 100;
    }

    //Criar um metodo para calcular o valor total da compra:
    //Dado a quantidade, calcular o valor da compra
    public double calcularValorTotal(int quantidade){
        return preco * quantidade;
    }
}
