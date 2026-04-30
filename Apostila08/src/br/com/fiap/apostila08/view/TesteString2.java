package br.com.fiap.apostila08.view;

import javax.swing.*;

public class TesteString2 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o email");

        //Validar se [e um email valido (possui @ e .)
        if(nome.indexOf("@") == -1 || (nome.indexOf(".") == -1)) {
                System.out.println("Nao e um email valido");
        }
        else {
            System.out.println("Seu email é: " + nome);
        }

    }
}
