package br.com.fiap.transportadora.model;

public class Produto {
    private int id;
    private String nome;
    private boolean fragil;
    private double peso;
    private float volume;

    public Produto(int id, String nome,double peso){    //Construtor 2
        this.id = id;
        this.nome = nome;
        this.peso = peso;

    }

    public Produto(int id, String nome,boolean fragil,double peso,float volume){   //Construtor 1
        this(id, nome, peso); //pode-se colocar assim para nao repetir o mesmo codigo ja que se repetem nos 2 construtores
        //this.id = id;
        //this.nome = nome;
        this.fragil = fragil;
        //this.peso = peso;
        this.volume = volume;

        //Se quiser utilizar o set no Terminal entao o contrutor deve estar escrito assim "public Produto()"

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
}
