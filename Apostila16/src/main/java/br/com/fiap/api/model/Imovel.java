package br.com.fiap.api.model;

public class Imovel {
    private int codigo;
    private String descricao;
    private double dimensao;
    private double valor;

    public Imovel(){

    }

    public Imovel(String descricao, double dimensao, double valor) {
        this.descricao = descricao;
        this.dimensao = dimensao;
        this.valor = valor;
    }

    public Imovel(int codigo, String descricao, double dimensao, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dimensao = dimensao;
        this.valor = valor;
    }

    public static void setId(int anInt) {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
