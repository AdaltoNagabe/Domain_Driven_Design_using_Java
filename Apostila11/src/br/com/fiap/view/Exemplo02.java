package br.com.fiap.view;

import br.com.fiap.model.Pokemon;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {

    static void main(String[] args){
        //criar uma lista de Pokemons (pokedex)
        List<Pokemon> pokedex = new ArrayList<>();

        //Instanciando 3 pokemons
        Pokemon zubat = new Pokemon("Sombrio","Zubat",5);
        Pokemon pigeot = new Pokemon("Voador","Pigeout",8);
        Pokemon miau = new Pokemon("Normal","Miau",5);

        //adicionar os poemons na lista
        pokedex.add(zubat);
        pokedex.add(pigeot);
        pokedex.add(miau);

        //exibir os dados dos pokemons
        System.out.println("Pokedex possui " + pokedex.size() + " pokemons");

        //exibir um pokemon por linha
        for (int i = 0; i < pokedex.size(); i++){
            System.out.println((i + 1) + " - " + pokedex.get(i));
        }

        //utilizando o foreach
        System.out.println("Utilizando o foreach");
        for(Pokemon p : pokedex){
            System.out.println(p);
        }

    }
}
