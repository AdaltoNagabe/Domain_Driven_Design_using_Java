package br.com.fiap.portal.model;

public class Aluno extends Pessoa{

    private int rm;
    private String turma;


    public Aluno(String nome, String cpf, int rm, String turma){
        super(nome, cpf);
        this.rm = rm;
        this.turma = turma;
    }

    //criar um construtor com nome, cpf, idade, endereco, rm, turma
    public Aluno(String nome, String cpf, int idade, Endereco endereco, int rm, String turma){
        super(nome, cpf, idade, endereco);
        this.rm = rm;
        this.turma = turma;
    }


    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
