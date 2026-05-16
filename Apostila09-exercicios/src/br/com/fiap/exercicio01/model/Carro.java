package br.com.fiap.exercicio01.model;

public class Carro extends Veiculo {

    private int quantidadePortas;
    private String placa;
    private float motor = 1;

    public Carro(String modelo, int quantidadeLugares, double comprimento, Cor cor, int anoFabricacao, int quantidadePortas, String placa, float motor) {
        super(modelo, quantidadeLugares, comprimento, cor, anoFabricacao);
        this.quantidadePortas = quantidadePortas;
        this.placa = placa;
        this.motor = motor;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }
}
