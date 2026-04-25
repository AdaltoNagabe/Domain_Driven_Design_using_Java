package br.com.fiap.apostila07.view;
import javax.swing.*;

public class ExemploSwitchCase {

    public static void main(String[] args) {
        //Calculadora (Soma, subtracao, divisao e multiplicacao)
        //Ler 2 numeros e fazer a operacao

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));

        String operacao = JOptionPane.showInputDialog("Digite a operacao (+, -, /, *): ");

        switch (operacao){
            case "+":
                JOptionPane.showMessageDialog(null,"A soma dos os numeros 1 e 2 é: " + (num1 + num2));
                break;

            case "-":
                JOptionPane.showMessageDialog(null,"A subtracao do numero 1 com o numero 2 é: " + (num1 - num2));
                break;

            case "*":
                JOptionPane.showMessageDialog(null,"A multiplicacao entre os numeros 1 e 2 é: " + (num1 * num2));
                break;

            case "/":
                if (num2 == 0){
                    JOptionPane.showMessageDialog(null,"DIVISAO POR 0!!! PROCESSO ENCERRADO!!!");
                }
                else {
                    JOptionPane.showMessageDialog(null, "A divisao do numero 1 com o numero 2 é: " + (num1 / num2));
                }
                break;

            default: // Se nao for nenhuma das opcoes
                JOptionPane.showMessageDialog(null, "OPERADOR INCORRETO!!! PROCESSO ENCERRADO!!!");
        } // fim Switch

    } // Fim main

} // Fim Class
