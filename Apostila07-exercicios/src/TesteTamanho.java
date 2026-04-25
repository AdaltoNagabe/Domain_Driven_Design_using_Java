package br.com.fiap.apostila07.view;
import javax.swing.*;

public class TesteTamanho {

    //Crie uma classe TesteTamanho em Java que peca o nome a altura e o peso de 2
    //pessoas e apresente o nome da mais pesada e o nome da mais alta

    static void main() {

                double altura1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da primeira pessoa: "));
                double peso1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da primeira pessoa: "));
                String pessoa1 = JOptionPane.showInputDialog("Digite o nome da primeira pessoa: ");

                double altura2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da segunda pessoa: "));
                double peso2 = Double.parseDouble(JOptionPane.showInputDialog("Digite peso da segunda pessoa: "));
                String pessoa2 = JOptionPane.showInputDialog("Digite o nome da segunda pessoa: ");

                if (altura1 > altura2){
                            JOptionPane.showMessageDialog(null,"A pessoa " + pessoa1 + " e mais alta. Sua altura e: " + altura1);
                }
                else {
                            JOptionPane.showMessageDialog(null, "A pessoa " + pessoa2 + " e mais alta. Sua altura e: " + altura2);
                }

                if (peso1 > peso2){
                    JOptionPane.showMessageDialog(null,"A pessoa " + pessoa1 + " e mais pesada. Seu peso e: " + peso1);
                }
                else {
                    JOptionPane.showMessageDialog(null, "A pessoa " + pessoa2 + " e mais pesada. Seu peso e: " + peso2);
                }

    }

}
