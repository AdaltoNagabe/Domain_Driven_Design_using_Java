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

        //Exibir os valores do aviao (incluindo a cor)
        System.out.println(aviao.getModelo());
        System.out.println(aviao.getAnoFabricacao());
        System.out.println(aviao.getComprimento());
        System.out.println(aviao.getPrefixo());
        System.out.println(aviao.getQuantidadeLugares());
        System.out.println(aviao.getQuantidadeTurbinas());
        System.out.println(azul.getNome());;
        System.out.println("---------------------------");
    }
}
