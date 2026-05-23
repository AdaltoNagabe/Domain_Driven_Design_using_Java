package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Produto;
import br.com.fiap.loja.model.ProdutoDigital;
import br.com.fiap.loja.model.ProdutoFisico;

import javax.swing.*;

public class Terminal {

    public static void main(String[] args) {

        //Instanciar um produto fisico
        Produto celular = new ProdutoFisico("Nokia p43",1000,"0123456",5,5);

        //Ler o desconto
        int porcentagem = Integer.parseInt(JOptionPane.showInputDialog("Digite a % de desconto: "));

        //Calcular e exibir o preco final
        System.out.println(celular.calcularDesconto((porcentagem)));

        float valor = Float.parseFloat((JOptionPane.showInputDialog("Digite o valor de desconto: ")));
        System.out.println(celular.calcularDesconto(valor));

        String cupom = (JOptionPane.showInputDialog("Digite o cupom de desconto: "));

        System.out.println(celular.calcularDesconto(cupom));

        System.out.println(celular); //tem que sobrescrever por senao vem um valor estranho

        //Validar  tipo de objeto que esta em uma variavel
        if (celular instanceof ProdutoFisico)
            System.out.println("E um produto fisico");
        else if (celular instanceof ProdutoDigital)
            System.out.println("E um produto digital");
    }
}
