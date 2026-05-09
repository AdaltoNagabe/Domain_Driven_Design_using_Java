package br.com.fiap.portal.view;
import br.com.fiap.portal.model.Aluno;
import br.com.fiap.portal.model.Endereco;
import br.com.fiap.portal.model.Professor;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {

        //Ler dos dados do aluno
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome = leitor.next() + leitor.nextLine();

        System.out.println("Informe o CPF: ");
        String cpf = leitor.next() + leitor.nextLine();

        System.out.println("Informe o endereco: ");
        String logradouro = leitor.next() + leitor.nextLine();

        System.out.println("Informe a idade: ");
        int idade = leitor.nextInt();

        System.out.println("Informe o rm: ");
        int rm = leitor.nextInt();

        System.out.println("Informe o turma: ");
        String turma = leitor.next() + leitor.nextLine();

        System.out.println("Informe a disciplina: ");
        String materia = leitor.next() + leitor.nextLine();

        System.out.println("Qual o professor? ");
        String nomeProf = leitor.next() + leitor.nextLine();


        //Criar o objeto aluno e atribuir os valores nos atributos
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Endereco endereco = new Endereco();
        aluno.setRm(rm);
        aluno.setIdade(idade);
        aluno.setNome(nome);
        aluno.setCpf(cpf);
        aluno.setTurma(turma);
        endereco.setLogradouro(logradouro);
        professor.setMateria(materia);
        professor.setNome(nomeProf);

        //Exibir os valores do objeto
        System.out.println("\n DADOS DO ALUNO ");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Endereco: " + endereco.getLogradouro());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("RM: " + aluno.getRm());
        System.out.println("Turma: " + aluno.getTurma());
        System.out.println("Materia: " + professor.getMateria());
        System.out.println("Professor: " + professor.getNome());



    }//main
}//class
