package br.com.fiap.view;

import br.com.fiap.model.Aluno;
import java.util.Scanner;

public class Terminal {

    //Ler os dados do aluno
    //Criar o objeto aluno e adicionar os valores nos atributos
    public static void main(String[] args) {
        Scanner leitorTeclado = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do Aluno: ");
        aluno.nomeAluno = leitorTeclado.next() + leitorTeclado.nextLine();

        System.out.println("Digite a nota da CP1: ");
        aluno.cp1 = leitorTeclado.nextDouble();
        System.out.println("Digite a nota da CP2: ");
        aluno.cp2 = leitorTeclado.nextDouble();
        System.out.println("Digite a nota do Challenge1: ");
        aluno.sprint1 = leitorTeclado.nextDouble();
        System.out.println("Digite a nota da Challenge2: ");
        aluno.sprint2 = leitorTeclado.nextDouble();
        System.out.println("Digite a nota da Global Solution: ");
        aluno.gs = leitorTeclado.nextDouble();

        //Calcular a media
        double mediaSemestreAluno = aluno.calcularMediaAluno();

        //Exibir a media
        System.out.println("A media do aluno " + aluno.nomeAluno + " e: " + mediaSemestreAluno);

    }
}
