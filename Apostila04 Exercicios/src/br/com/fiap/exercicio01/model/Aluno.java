package br.com.fiap.exercicio01.model;

public class Aluno {

    public String nomeAluno;
    public double cp1, cp2, sprint1, sprint2, gs;

    public double calcularMediaAluno(){
        return ((((cp1 + cp2)/2) * 0.2) + (((sprint1 + sprint2)/2) * 0.2) + (gs * 0.6));
    }
}
