package br.com.fiap.apostila07.view;
import javax.swing.*;

public class TesteEleitor {
    //Crie uma classe TesteEleitor que leia a idade de 3 pessoas e informe a sua clase eleitoral
    //Nao eleitor (abaixo de 16 anos)
    //Eleitor obrigatorio (entre 18 e 65 anos)
    //Eleitor facultativo (16,17 ou maior que 65 anos)
    //Ao final da execucao exibir o total de eleitores obrigatorios

    static void main() {
        int obrigatorio=0;

        String eleitor1 = JOptionPane.showInputDialog("Digite o nome do primeiro eleitor: ");
        int idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do primeiro eleitor: "));
        if (idade1 < 16){
            JOptionPane.showMessageDialog(null, "Nao eleitor");
        }
        else if(idade1 >= 18 && idade1 <= 65){
            JOptionPane.showMessageDialog(null,"Eleitor");
            obrigatorio ++;
        }
        else{
            JOptionPane.showMessageDialog(null, "Facultativo");
        }

        String eleitor2 = JOptionPane.showInputDialog("Digite o nome do segundo eleitor: ");
        int idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do segundo eleitor: "));

        if (idade2 < 16){
            JOptionPane.showMessageDialog(null, "Nao eleitor");
        }
        else if(idade2 >= 18 && idade2 <= 65){
            JOptionPane.showMessageDialog(null,"Eleitor");
            obrigatorio ++;

        }
        else{
            JOptionPane.showMessageDialog(null, "Facultativo");
        }

        String eleitor3 = JOptionPane.showInputDialog("Digite o nome do terceiro eleitor: ");
        int idade3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do terceiro eleitor: "));

        if (idade3 < 16){
            JOptionPane.showMessageDialog(null, "Nao eleitor");
        }
        else if(idade3 >= 18 && idade3 <= 65){
            JOptionPane.showMessageDialog(null,"Eleitor");
            obrigatorio ++;
        }
        else{
            JOptionPane.showMessageDialog(null, "Facultativo");
        }

        JOptionPane.showMessageDialog(null, "Eleitores obrigatorios " + obrigatorio);

    }

}
