package br.com.fiap.apostila07.view;


import javax.swing.*;
import java.util.Scanner;

public class ExemploCondicional {

    public static void main(String[] args) {

        //Ler a media final do aluno
        //double mediaFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite a media: ")); //Faz o mesmo das duas linhas abaixo. Economiza codigo

        String mediaFinalStr = JOptionPane.showInputDialog("Digite a media final: ");
        double mediaFinal = Double.parseDouble(mediaFinalStr);

        //Scanner leitor = new Scanner(System.in); //Caso use o scanner. Nao precisa converter para valor


        //Dizer se esta aprovado, retido ou de exame
        if(mediaFinal >= 6){
            System.out.println("APROVADO");
            JOptionPane.showMessageDialog(null,"APROVADO");
        }
        else if (mediaFinal < 4){
            System.out.println("RETIDO");
            JOptionPane.showMessageDialog(null,"RETIDO");
        }
        else{
            System.out.println("EXAME");
            JOptionPane.showMessageDialog(null,"EXAME");
        }

    }
}
