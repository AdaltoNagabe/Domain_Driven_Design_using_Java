package br.com.restaurante.view;

import br.com.restaurante.model.Funcionario;

public class Terminal {

    public static void main(String args[]) {

        //Criar um objeto Funcionario
        Funcionario func = new Funcionario();
        func.setNomeFuncionario("Adalto"); // Alterar o nome do Funcionario
        System.out.println(func.getNomeFuncionario()); //Recuperar o nome do Funcionario

        func.setFuncionarioAtivo(true);
        func.setSalarioFuncionario(2000.50);
        func.setIdFuncionario(35);
        func.setSexoFuncionario('F');

        System.out.println(func.getfuncionarioAtivo());
        System.out.println(func.getSalarioFuncionario());
        System.out.println(func.getIdFuncionario());
        System.out.println(func.getSexoFuncionario());

    }
}
