package br.com.fiap.view;

import java.util.HashSet;
import java.util.Set;

public class Exemplo03 {

    static void main(String[] args){
        //criar um conjunto de numeros
        Set<Integer> sorteios = new HashSet<>();

        //adicionar 3 numeros
        sorteios.add(5);
        sorteios.add(7);
        sorteios.add(10);
        sorteios.add(5); //nao permite dado repetido, vai ignorar

        //exibir a quantidade de numeros
        System.out.println("Numeros sorteados: " + sorteios.size());

        //exibir os numeros
        System.out.println("Os numeros sao: " + sorteios);

        //exibir com o foreach
        for (Integer n : sorteios){
            System.out.println(n);
        }

    }



}
