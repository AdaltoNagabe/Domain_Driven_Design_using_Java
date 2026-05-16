package br.com.fiap.exercicio01.model;

public class Lancha extends Veiculo{

    private int quantidadeMotores;

    public Lancha(String modelo, int quantidadeLugares, double comprimento, Cor cor, int anoFabricacao, int quantidadeMotores) {
        super(modelo, quantidadeLugares, comprimento, cor, anoFabricacao);
        this.quantidadeMotores = quantidadeMotores;
    }

    public int getQuantidadeMotores() {
        return quantidadeMotores;
    }

    public void setQuantidadeMotores(int quantidadeMotores) {
        this.quantidadeMotores = quantidadeMotores;
    }
}
