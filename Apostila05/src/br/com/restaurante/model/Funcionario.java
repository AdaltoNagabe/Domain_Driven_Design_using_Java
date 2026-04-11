package br.com.restaurante.model;

public class Funcionario {

    private String nomeFuncionario;
    private int idFuncionario;
    private boolean funcionarioAtivo;
    private double salarioFuncionario;
    private char sexoFuncionario;

    public String retornarSalario(){
        return formatarReal(salarioFuncionario);
    }
    public String retornarPlr(){
        double plr = calculaPlr();
        return formatarReal(plr);
    }

    private String formatarReal(double valor){
        return "R$ " + valor;
    }

    public double calculaPlr(){
        return salarioFuncionario * 3;
    }

    public void colocarEmFerias(){
        this.funcionarioAtivo = false;
    }

    //Getters e Setters (Métodos para alterar e recuperar os valores de um atributo)
    public String getNomeFuncionario(){
        return nomeFuncionario;
    }
    //No caso do set pode ser usado dessa forma, criando uma nova identidade nome
    public void setNomeFuncionario(String nome){
        nomeFuncionario = nome;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }
    //Ou então dessa forma que é o correto pelas boas praticas, usando o nome da variavel e colocando o "this." antes
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    public boolean getfuncionarioAtivo(){
        return funcionarioAtivo;
    }

    public void setFuncionarioAtivo(boolean funcionarioAtivo) {
        this.funcionarioAtivo = funcionarioAtivo;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public char getSexoFuncionario() {
        return sexoFuncionario;
    }

    public void setSexoFuncionario(char sexoFuncionario) {
        this.sexoFuncionario = sexoFuncionario;
    }
}
