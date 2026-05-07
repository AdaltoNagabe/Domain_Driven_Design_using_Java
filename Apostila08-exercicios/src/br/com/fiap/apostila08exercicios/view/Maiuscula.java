package br.com.fiap.apostila08exercicios.view;

import javax.swing.*;

public class Maiuscula {
    public static void main(String[] args) {
        String nomeCompleto = JOptionPane.showInputDialog("Digite o nome completo:");
        System.out.println(nomeCompleto.toUpperCase());

    }
}
