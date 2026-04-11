package br.com.fiap.exercicio1.model;

public class Lancha {
    private String motor;
    private  int quantidadeLugares;
    private double comprimento;
    private int anoFabricacao;
    private Cor cor;
    private int quantidadeMotores;

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getQuantidadeLugares() {
        return quantidadeLugares;
    }

    public void setQuantidadeLugares(int quantidadeLugares) {
        this.quantidadeLugares = quantidadeLugares;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public int getQuantidadeMotores() {
        return quantidadeMotores;
    }

    public void setQuantidadeMotores(int quantidadeMotores) {
        this.quantidadeMotores = quantidadeMotores;
    }
}
