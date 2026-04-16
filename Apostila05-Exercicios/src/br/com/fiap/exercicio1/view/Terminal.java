package br.com.fiap.exercicio1.view;

import br.com.fiap.exercicio1.model.Cor;
import br.com.fiap.exercicio1.model.Aviao;
import br.com.fiap.exercicio1.model.Lancha;
import br.com.fiap.exercicio1.model.Carro;

public class Terminal {
    public static void main(String[] args){
        //Criar um objeto cor
        Cor azul = new Cor();

        //Atribuir os valores para os atributos a cor
        azul.alterarCor(0,0,255,"Azul");

        //Criar um objeto aviao
        Aviao aviao = new Aviao();

        //Atribuir os valores para os atributos do aviao
        aviao.setModelo("Embraer");
        aviao.setAnoFabricacao(2015);
        aviao.setComprimento(80);
        aviao.setPrefixo("PT2026");
        aviao.setQuantidadeLugares(150);
        aviao.setQuantidadeTurbinas(2);
        aviao.setCor(azul);

        //Exibir os valores do aviao (incluindo a cor)
        System.out.println(aviao.getModelo());
        System.out.println(aviao.getAnoFabricacao());
        System.out.println(aviao.getComprimento());
        System.out.println(aviao.getPrefixo());
        System.out.println(aviao.getQuantidadeLugares());
        System.out.println(aviao.getQuantidadeTurbinas());
        System.out.println(aviao.getCor().getNome());
        System.out.println("---------------------------");


        //Criar um objeto cor
        Cor verde = new Cor();

        //Atribuir os valores para os atributos a cor
        verde.alterarCor(0,255,0,"Verde");

        //Criar um objeto carro
        Carro carro = new Carro();

        //Atribuir os valores para os atributos do aviao
        carro.setModelo("Fusca");
        carro.setAnoFabricacao(1970);
        carro.setComprimento(2);
        carro.setQuantidadePortas(2);
        carro.setQuantidadeLugares(5);
        carro.setPlaca("QT1518");


        //Exibir os valores do carro (incluindo a cor)
        System.out.println(carro.getModelo());
        System.out.println(carro.getAnoFabricacao());
        System.out.println(carro.getComprimento());
        System.out.println(carro.getQuantidadePortas());
        System.out.println(carro.getQuantidadeLugares());
        System.out.println(carro.getPlaca());
        System.out.println(verde.getNome());;
        System.out.println("---------------------------");

        //Criar um objeto cor
        Cor vermelho = new Cor();

        //Atribuir os valores para os atributos a cor
        vermelho.alterarCor(255,0,0,"Vermelho");

        //Criar um objeto lancha
        Lancha lancha = new Lancha();

        //Atribuir os valores para os atributos do aviao
        lancha.setComprimento(30);
        lancha.setAnoFabricacao(2000);
        lancha.setQuantidadeLugares(20);
        lancha.setMotor("Yamaha");
        lancha.setQuantidadeMotores(2);


        //Exibir os valores da lancha (incluindo a cor)
        System.out.println("Ano: " + lancha.getAnoFabricacao());
        System.out.println("Comprimento: " + lancha.getComprimento());
        System.out.println(lancha.getMotor());
        System.out.println(lancha.getQuantidadeLugares());
        System.out.println(lancha.getQuantidadeMotores());
        System.out.println(vermelho.getNome());;
        System.out.println("---------------------------");

    }
}
