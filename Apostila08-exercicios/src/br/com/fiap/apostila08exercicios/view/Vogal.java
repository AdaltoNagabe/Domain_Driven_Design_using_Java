package br.com.fiap.apostila08exercicios.view;

import javax.swing.*;

public class Vogal {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite uma palavra:");

        //Substituir as vogais por *
        String vogais = "aeiouAEIOU";

        //Laco para percorrer a palavra buscando vogais
        for (int i = 0 ; i < vogais.length(); i++) {
            texto = texto.replace(vogais.charAt(i), '*');
        }

        //String palavraAlterada = texto.replaceAll("[aeiou]", "*"); //melhor assim mais facil
        System.out.println(texto);

    }
}
