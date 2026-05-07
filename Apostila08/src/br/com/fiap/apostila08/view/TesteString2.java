package br.com.fiap.apostila08.view;

import javax.swing.*;

public class TesteString2 {
    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog("Digite o email");

        //Validar se [e um email valido (possui @ e .)
        //if (nome.contains("@") == -1 ... funciona da mesma forma
        if(email.indexOf("@") == -1 || (email.indexOf(".") == -1)) {
                System.out.println("Nao e um email valido");
        }
        else {
            System.out.println("Seu email é: " + email);
            //Exibir o email sem o dominio ex: thiago@fiap.com.br, quero exibir o thiago
            String nomeEmail = email.substring(0,email.indexOf("@"));
            System.out.println(nomeEmail);

            //Exibir o dominio ex; tiahigo@fiap.com.br , quero exibir o @fiap.com.br
            String dominioEmail = email.substring(email.indexOf("@") + 1);
            System.out.println(dominioEmail);
        }


    }

}
