package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.ProdutoDao;
import br.com.fiap.apostila13.model.Produto;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExemploPesquisaPorValor {

    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            //Ler o codigo do produto
            System.out.println("Digite o valor minimo do Produto: ");
            double valor = leitor.nextDouble();

            //Instanciar o ProdutoDao
            ProdutoDao dao= new ProdutoDao();

            //Chamar o método de pesquisa
            List<Produto> lista = dao.buscarPorPrecoMaior(valor);

            //Exibir os dados do produto
            System.out.println(lista);
        }catch (InputMismatchException e) {
            System.err.println("Digite um numero valido!!!");
        }catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }

    }//main
}//class
