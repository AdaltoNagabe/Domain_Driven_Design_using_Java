package br.com.fiap.loja.model;

public class ProdutoFisico extends Produto{

    private float volume;
    private float peso;

    public ProdutoFisico(String nome, double preco, String codigoBarra, float volume, float peso) {
        super(nome, preco, codigoBarra);
        this.volume = volume;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + ", peso: " + peso + ", volume: " + volume;
    }

    @Override
    public double calcularDesconto(int porcentagem) {
        return preco - preco * (porcentagem + 5) / 100; //Adiciona 5% a mais
    }

    @Override
    public double calcularDesconto(String cupom) {
        if (cupom.equals("PF50"))
            return preco * 0.5;
        return super.calcularDesconto(cupom);
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

}
