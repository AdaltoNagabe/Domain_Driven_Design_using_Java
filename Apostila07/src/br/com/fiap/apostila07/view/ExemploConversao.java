package br.com.fiap.apostila07.view;

import javax.swing.*;
import java.util.Scanner;

public class ExemploConversao {

    public static void main(String[] args) {
        //Calcular a area do retangulo
        String baseStr = JOptionPane.showInputDialog("Digite a base do retangulo"); //o JOption sempre retorna uma string

        //Converter string "base" para double
        double base = Double.parseDouble(baseStr);

        String alturaStr = JOptionPane.showInputDialog("Digite a altura do retangulo");
        double altura = Double.parseDouble(alturaStr);

        double area = base * altura;
        System.out.println("A base do retangulo e: " + base);
        System.out.println("A altura do retangulo e: " + altura);
        System.out.println("A area do retangulo informado e: " + area);
        System.out.printf("A area do retangulo formatado e: " + "%.2f", area); //Print f Limita as casas decimais

        JOptionPane.showMessageDialog(null,area); //Aparece o resultado em uma janela

    }

}
