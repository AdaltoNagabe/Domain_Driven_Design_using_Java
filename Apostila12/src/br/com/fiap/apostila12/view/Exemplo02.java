package br.com.fiap.apostila12.view;

import br.com.fiap.apostila12.model.Produto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo02 {

    static void main(String[] args) {
        //Instanciar um produto com nome e preco
        Produto prod1 = new Produto("Churros", 15);
        Scanner leitor = new Scanner(System.in);
        try {
            //Perguntar quanto e o desconto
            System.out.println("Qual o desconto? : ");
            double desconto = leitor.nextDouble();
            //Calcular o desconto
            double valorFinal = prod1.darDesconto(desconto);
            //Exibir o preco com desconto
            System.out.println("Valor com desconto: " + valorFinal);

        } catch (RuntimeException e){
            System.out.println("Número invalido!");
        } finally {
            System.out.println("Fim do programa!");
            leitor.close();
        }
    }
}
