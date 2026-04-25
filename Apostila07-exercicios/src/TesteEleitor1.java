package br.com.fiap.apostila07.view;
import javax.swing.*;

public class TesteEleitor1 {
    //Crie uma classe TesteEleitor que leia a idade de 3 pessoas e informe a sua clase eleitoral
    //Nao eleitor (abaixo de 16 anos)
    //Eleitor obrigatorio (entre 18 e 65 anos)
    //Eleitor facultativo (16,17 ou maior que 65 anos)
    //Ao final da execucao exibir o total de eleitores obrigatorios

    static void main() {
        int obrigatorio = 0;

        for (int i = 1; i < 4; i ++) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do eleitor: " + i));

            if  (idade < 16){
                JOptionPane.showMessageDialog(null, "Nao eleitor");
            }
            else if (idade >= 18 && idade <= 65) {
                JOptionPane.showMessageDialog(null, "Eleitor");
                obrigatorio++;
            }
            else {
                JOptionPane.showMessageDialog(null, "Facultativo");
            }
        }

        JOptionPane.showMessageDialog(null, "Eleitores obrigatorios " + obrigatorio);
    }

}