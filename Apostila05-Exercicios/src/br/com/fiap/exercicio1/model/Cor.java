package br.com.fiap.exercicio1.model;

public class Cor {

    private String nome;
    private int r;
    private int g;
    private int b;

    public void alterarCor(int r, int g, int b, String nome){
        this.r = r;
        this.g = g;
        this.b = b;
        this.nome = nome;
    }

    public int getR(){
        return r;
    }
    public void  setR(){
        this.r = r;
    }
    public int getG(){
        return g;
    }
    public void  setG() {
        this.g = g;
    }
    public int getB(){
        return b;
    }

    public void  setB(){
        this.b = b;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }
}
