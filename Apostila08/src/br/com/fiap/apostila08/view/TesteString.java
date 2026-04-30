package br.com.fiap.apostila08.view;

import javax.swing.*;

public class TesteString {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome:");
        System.out.println(nome + " é aluno da \"FIAP\". \nVamos no Evento!\n"); // (\n) coloca todo o texto posterior na linha de baixo
        // \"TEXTO"\ coloca aspas no texto

        //Comparar se o nome é "Jose". Nao funciona apenas no If Else se nao usar o metodo equals
        //O metodo equalsIgnoreCase nao diferencia maiusculas e minusculas
        if (nome.equalsIgnoreCase("Jose\n")){
            System.out.println("O nome confere\n");
        }
        else{
        System.out.println("Nao é o Jose\n");
        }

        //Exibir a quantidade de caracteres do nome metido length()
        System.out.println("Quantidade de caracteres e: " + nome.length());
        System.out.println("-----------------------------------------------\n");

        //Metodo charAt() retorno uma letra em uma posicao determinada

        //Imprimir o nome na vertical
        //A
        //d
        //a
        //l
        //t
        //o
        int quantidadeCarac = nome.length();
        for (int letra = 0; letra < quantidadeCarac; letra ++) {
            System.out.println(nome.charAt(letra));
        }

        //indexOf() traz a primeira ocorrencia de uma cadeia de caracteres
        nome.indexOf("t");


    }//main
}//class
