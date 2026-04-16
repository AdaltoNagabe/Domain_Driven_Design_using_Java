package br.com.fiap.empresa.model;

public class Funcionario {
    private String nome;
    private long matricula;
    private Profissao profissao;
    private double salario;

    public Funcionario(){

    }
    public Funcionario(long matricula){
        this.matricula = matricula;
    }
    public Funcionario(long matricula,String nome){
        this.nome = nome;
    }
    public Funcionario(long matricula,String nome, Profissao profissao){
        this.profissao = profissao;
    }
    public Funcionario(String nome, long matricula, Profissao profissao,double salario){
        this(nome,matricula,profissao);
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public profissao getProfissao() {
        return Profissao;
    }

    public void setProfissao(profissao profissao) {
        Profissao = profissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
