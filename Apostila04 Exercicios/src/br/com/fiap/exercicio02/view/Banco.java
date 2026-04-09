package br.com.fiap.view;

import br.com.fiap.exercicio02.model.ContaCorrente;
import br.com.fiap.exercicio02.model.Cliente;
import br.com.fiap.exercicio02.model.Endereco;

import java.util.Scanner;

public class Banco {

    //Ler os dados do cliente
    public static void main(String[] args) {
        Scanner leitorTeclado = new Scanner(System.in);

        Cliente cliente = new Cliente();
        ContaCorrente contaCorrente = new ContaCorrente();

        System.out.println("Digite o nome do Cliente: ");
        String nomeCliente = leitorTeclado.next() + leitorTeclado.nextLine();
        System.out.println("Digite o CPF do Cliente: ");
        String cpfCliente = leitorTeclado.next() + leitorTeclado.nextLine();
        System.out.println("Digite o endereco do Cliente: ");
        String enderecoCliente = leitorTeclado.next() + leitorTeclado.nextLine();
        System.out.println("Digite o endereco do Cliente: ");
        System.out.println("Deseja depositar um valor? ");
        boolean desejaDepositar = leitorTeclado.nextBoolean();

        System.out.println("Cliente " + nomeCliente + " seu saldo atual e: " + contaCorrente.saldoCliente);
        System.out.println("Digite o valor que deseja depositar: ");
        Double depositar = leitorTeclado.nextDouble();

        ContaCorrente conta = new ContaCorrente();
        double saldoAtualizado = conta.depositaValor(depositar);
        System.out.println("Seu novo saldo e: " + saldoAtualizado);

        System.out.println("Deseja retirar um valor? ");
        boolean desejaRetirar = leitorTeclado.nextBoolean();

        System.out.println("Cliente " + nomeCliente + " seu saldo atual e: " + contaCorrente.saldoCliente);
        System.out.println("Digite o valor que deseja retirar: ");
        Double retirar = leitorTeclado.nextDouble();

        System.out.println("Sr. " + nomeCliente + " seu novo saldo e: " + (saldoAtualizado - retirar));
        System.out.println("Seu endereco e: " + enderecoCliente);

    }
}
