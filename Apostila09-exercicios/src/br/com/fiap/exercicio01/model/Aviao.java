package br.com.fiap.exercicio01.model;

public class Aviao extends Veiculo {

    private String prefixo;
    private int quantidadeTurbinas;

    public Aviao(String modelo, int quantidadeLugares, double comprimento, Cor cor, int anoFabricacao, String prefixo, int quantidadeTurbinas) {
        super(modelo, quantidadeLugares, comprimento, cor, anoFabricacao);
        this.prefixo = prefixo;
        this.quantidadeTurbinas = quantidadeTurbinas;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public int getQuantidadeTurbinas() {
        return quantidadeTurbinas;
    }

    public void setQuantidadeTurbinas(int quantidadeTurbinas) {
        this.quantidadeTurbinas = quantidadeTurbinas;
    }
}
