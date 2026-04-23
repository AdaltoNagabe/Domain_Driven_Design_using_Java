package br.com.fiap.apostila07.view;
import javax.swing.*;
import java.util.Scanner;

public class ExemploSwitchCase {

    public static void main(String[] args) {
        //Calculadora (Soma, subtracao, divisao e multiplicacao)
        //Ler 2 numeros e fazer a operacao

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
        //Scanner leitor = new Scanner(System.in);
        //System.out.print("Digite a operacao (+, -, *, /): ");
        //String operacao = leitor.nextLine();

        char operacao = JOptionPane.showInputDialog ("Digite a operacao: ");

        switch (operacao){
            case "+":
                System.out.println("A soma dos os numeros 1 e 2 é: " + (num1 + num2));
                JOptionPane.showMessageDialog(null,"A soma dos os numeros 1 e 2 é: " + (num1 + num2));
                break;

            case "-":
                System.out.println("A subtracao entre os numeros 1 e 2 é: " + (num1 - num2));
                JOptionPane.showMessageDialog(null,"A subtracao entre os numeros 1 e 2 é: " + (num1 - num2));
                break;

            case "*":
                System.out.println("A multiplicacao entre os numeros 1 e 2 é: " + (num1 * num2));
                JOptionPane.showMessageDialog(null,"A multiplicacao entre os numeros 1 e 2 é: " + (num1 * num2));
                break;

            case "/":
                System.out.println("A divisao entre os numeros 1 e 2 é: " + (num1 / num2));
                JOptionPane.showMessageDialog(null,"A divisao entre os numeros 1 e 2 é: " + (num1 / num2));
                break;

            default: // Se nao for nenhuma das opcoes
                System.out.println("Operador Incorreto");
        }

    }

}
