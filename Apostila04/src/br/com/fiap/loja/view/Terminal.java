package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Produto;
import br.com.fiap.loja.model.Fornecedor;
import java.util.Scanner;

//Responsavel por interagir com o usuario
public class Terminal {

    public static void main(String[] args) {
        //Ler as informacoes do Produto (sem fornecer por enquanto)
        //criar o objeto para ler o teclado
        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Digite o nome do Produto: ");
        String nomeProduto = leitorTeclado.next() + leitorTeclado.nextLine();
        System.out.println("Digite o nome do Fornecedor: ");
        String nomeFornecedor = leitorTeclado.next() + leitorTeclado.nextLine();
        System.out.println("Digite o CNPJ do Fornecedor: ");
        String cnpj = leitorTeclado.next();
        System.out.println("Digite o codigo do Produto: ");
        int codigo = leitorTeclado.nextInt();
        System.out.println("Digite o preco do Produto: ");
        double preco = leitorTeclado.nextDouble();
        System.out.println("Esta disponivel? ");
        boolean disponivel = leitorTeclado.nextBoolean();

        // Instanciar a classe produto
        Produto prod = new Produto();

        //Colocar as informacoes no objeto produto
        prod.nomeProduto = nomeProduto;
        prod.preco = preco;
        prod.codigo = codigo;
        prod.disponivel = disponivel;

        //Colocar as informacoes no objeto Fornecedor
        Fornecedor forn = new Fornecedor();

        //Colocar as informacoes no objeto produto
        forn.cnpj = cnpj;
        forn.nomeFornecedor = nomeFornecedor;


        //Exibir as informacoes do objeto produto
        System.out.println("INFORMACOES DO PRODUTO");
        System.out.println("Fornecedor: " + forn.nomeFornecedor);
        System.out.println("CPNJ: " + forn.cnpj);
        System.out.println("Produto: " + prod.nomeProduto);
        System.out.println("Codigo do Produto: " + prod.codigo);
        System.out.println("Valor Unitario: " + prod.preco);
        System.out.println("Disponivel: " + prod.disponivel);

    }
}
