package br.com.fiap.empresa.model;

public class Funcionario {
    private String nome;
    private long matricula;
    private Profissao profissao;
    private double salario;

    //construtor padrao (vazio)
    public Funcionario(){
    }
    //construtor com a matricula
    public Funcionario(long matricula){
        this.matricula = matricula;
    }
    //construtor com matricula e nome
    public Funcionario(long matricula,String nome){
        this.matricula = matricula;
        this.nome = nome;
    }
    //construtor com matricula, nome e profissao
    public Funcionario(long matricula,String nome, Profissao profissao){
        this(matricula,nome);
        this.profissao = profissao;
    }
    //construtor com todos os atributos
    //public Funcionario(String nome, long matricula, Profissao profissao,double salario){
    //    this(matricula,nome,profissao);
    //    this.salario = salario;
    //}

    public String exibirDados() {
        return "Nome: " + nome + ", matricula: " + matricula + ", profissao: " + profissao.getNomeProfissao() + ", salario: " + salario;
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

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
