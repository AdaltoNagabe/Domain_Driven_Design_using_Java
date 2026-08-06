package br.com.fiap.view;

import br.com.fiap.model.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {

    static void main(String[] args){
        //criar uma lista de Pokemons (pokedex)
        List<Pokemon> pokedex = new ArrayList<>();

        //adicionar 3 pokemons

        Pokemon pikachu = new pokedex("eletrico","pikachu",3);
        Pokemon bulbassauro = new Pokemon("planta","bulbassauro",2);
        Pokemon eevee = new Pokemon("planta","eevee",3);


        //exibir os dados dos pokemons
        System.out.println(pokedex);


    }
}
