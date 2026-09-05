package br.com.fiap.apostila13.view;

import br.com.fiap.apostila13.dao.ProdutoDao;
import br.com.fiap.apostila13.model.Produto;

import java.util.Scanner;

public class ExemploRemocao {
    static void main(String[] args) {
        //Ler os dados do produto
        Scanner leitor = new Scanner(System.in);
        try {
            System.out.println("Digite o codigo do produto a ser removido ");
            int codigo = leitor.nextInt();

            //Instanciar um ProdutoDao
            ProdutoDao produtoDao = new ProdutoDao();
            produtoDao.apagar(codigo);
            System.out.println("Produto Removido!");

        }catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
