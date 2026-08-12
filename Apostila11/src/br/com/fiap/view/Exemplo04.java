package br.com.fiap.view;

import java.util.HashMap;
import java.util.Map;

public class Exemplo04 {

    static void main(String[] args) {

        //Map - Hashmap
        //chave e o nome e o valor e o ano de nascimento
        Map<String, Integer> registro = new HashMap<>();

        //adicionar 3 registros
        registro.put("Adalto", 1970);
        registro.put("Ruth", 1975);
        registro.put("Yumi", 1998);
        registro.put("Adalto", 1969); //Se repetir a chave vai substituir o valor

        //exibir a quantidade de registros
        System.out.println("Quantidade de registros: " + registro.size());

        //recuperar o ano de nascimento do Adalto
        System.out.println("O ano de nascimento do Adalto e: " + registro.get("Adalto"));

        //exibir os registros
        System.out.println("Os registros sao: " + registro);

        //exibe os valores percorrendo as chaves e o valor que esta no mapa da chave
        for (String chave : registro.keySet()){
            System.out.println(chave + " - " + registro.get(chave));
        }

    }

}
