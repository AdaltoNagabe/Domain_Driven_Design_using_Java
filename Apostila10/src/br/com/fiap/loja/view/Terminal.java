package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Produto;
import br.com.fiap.loja.model.ProdutoFisico;

import javax.swing.*;

public class Terminal {

    public static void main(String[] args) {

        //Instanciar um produto fisico
        ProdutoFisico celular = new ProdutoFisico("Nokia p43",1000,"0123456",5,5);

        //Ler o desconto
        int porcentagem = Integer.parseInt(JOptionPane.showInputDialog("Digite a % de desconto: "));

        //Calcular e exibir o preco final
        System.out.println(celular.calcularDesconto((porcentagem)));

        float valor = Float.parseFloat((JOptionPane.showInputDialog("Digite o valor de desconto: ")));
        System.out.println(celular.calcularDesconto(valor));

        String cupom = (JOptionPane.showInputDialog("Digite o cupom de desconto: "));

        System.out.println(celular.calcularDesconto(cupom));


    }
}
