package br.com.fiap.empresa.view;
import br.com.fiap.empresa.model.Profissao;
import br.com.fiap.empresa.model.Funcionario;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Terminal {

    public static void main(String[] args) {

        //ler os dados do funcionario
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite a matricula: ");
        long matricula = leitor.nextLong();

        System.out.println("Digite o salario: ");
        double salario = leitor.nextDouble();

        System.out.println("Digite a profissao: ");
        String nomeProfissao = leitor.next() + leitor.nextLine();

        //criar o objeto funcionario com os dados
        Profissao p = new Profissao(nomeProfissao);
        Funcionario f = new Funcionario(matricula,nome,p);
        f.setSalario(salario);

        //Funcionario p = new Funcionario(123456);
        //Funcionario g = new Funcionario(123456,"Adalto");
        //Funcionario h = new Funcionario(123456,"Adalto","Tecnico");

        //exibir os dados do funcionario
        System.out.println(f.exibirDados());

    }
}
