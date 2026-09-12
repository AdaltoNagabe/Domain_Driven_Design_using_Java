package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.ProdutoDao;
import br.com.fiap.apostila13.model.Produto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploPesquisaValor {

    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

    try {
        //Ler o codigo do produto
        System.out.println("Digite o valor ");
        double valor = leitor.nextDouble();

        //Instanciar o ProdutoDao
        ProdutoDao dao= new ProdutoDao();

        //Chamar o método de pesquisa
        Produto produto = dao.buscarValor(valor);

        //Exibir os dados do produto
        System.out.println(produto);
    }catch (InputMismatchException e) {
        System.out.println("Numero Invalido!!!");
    }catch (Exception e) {
        System.err.println("Erro: " + e.getMessage());
    }

    }//main
}//class
