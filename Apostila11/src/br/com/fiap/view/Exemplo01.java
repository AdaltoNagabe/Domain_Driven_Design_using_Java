package br.com.fiap.view;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Exemplo01 {

    static void main(String[] args) {
        //criar uma variavel para armazenar o nome da turma
        String turma = "1TDSPW";

        //criar uma variavel para armazenar o nome dos alunos da turma
        //colecoes do java list e set
        List<String> alunos = new ArrayList<>();

        //adicionar 2 nomes na lista
        alunos.add("Gabriel");
        alunos.add("Alexandre");
        alunos.add(1,"Julia"); //Adiciona na posicao
        alunos.set(2,"Adalto"); //substituir

        //verificar quantos alunos tem na lista
        System.out.println("Quantidade de alunos: " + alunos.size());

        //verificar se o "Gabriel" esta na lista
        System.out.println("Gabriel esta na lista? " + alunos.contains("Gabriel"));

        //verificar se a lista esta vazia
        if (alunos.isEmpty())
            System.out.println("A lista esta vazia");
        else
            System.out.println("A lista possui nomes");

        //recuperar o aluno da posicao 2
        System.out.println("O nome da posicao 2 e: " + alunos.get(2));

        //exibir todos os alunos
        System.out.println("A lista completa possui os seguintes nomes: " + alunos);

    }
}
