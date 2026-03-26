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

        //Instanciar o Fornecedor
        Fornecedor forn = new Fornecedor();

        //Colocar as informacoes no objeto Fornecedor
        forn.cnpj = cnpj;
        forn.nomeFornecedor = nomeFornecedor;

        //Colocar o fornecedor no produto
        prod.nomefornecedor = forn;

        //Exibir as informacoes do objeto produto e fornecedor
        System.out.println("INFORMACOES DO PRODUTO");
        System.out.println("----------------------");
        System.out.println("Fornecedor: " + forn.nomeFornecedor);
        System.out.println("Nome Fornecedor: " + prod.nomefornecedor.nomeFornecedor);
        System.out.println("CPNJ: " + forn.cnpj);
        System.out.println("Produto: " + prod.nomeProduto);
        System.out.println("Codigo do Produto: " + prod.codigo);
        System.out.println("Valor Unitario: " + prod.preco);
        System.out.println("Disponivel: " + prod.disponivel);

        //Chamando o metodo da classe produto
        double descontoProduto = prod.calcularDesconto();

        //Calculando o valor do desconto
        double promocao = prod.calcularDesconto();
        System.out.println("Desconto: " + promocao);

        //Aqui solicita para o usuario entrar com a aliquota de aumento e quantidade do produto
        System.out.println("Qual a porcentagem de aumento? ");
        double porcentagem = leitorTeclado.nextDouble();
        System.out.println("Qual a quantidade de " + nomeProduto);
        double porcentagem = leitorTeclado.nextDouble();

        //Chamando o metodo aumento
        prod.aumentarPreco(porcentagem);

        System.out.println("Novo preco do produto: " + prod.preco);

        //Criar um metodo para calcular o valor total da compra:
        //Dado a quantidade, calcular o valor da compra


    }
}
