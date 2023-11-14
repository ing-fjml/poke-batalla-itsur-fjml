/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla;

import pokebatalla.model.battels.Batalla;
import pokebatalla.model.battels.Entrenador;
import pokebatalla.pokemons.Bullbasaur;
import pokebatalla.pokemons.Charmander;
import pokebatalla.pokemons.Clefable;
import pokebatalla.pokemons.PonytadeGalar;
import pokebatalla.pokemons.Squirtle;

/**
 *
 ** @author Hannia Dinora Gonzalez Magaña
 */
public class MAIN {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");

        Charmander charmanderSalvaje = new Charmander();
        Clefable clefableSalvaje = new Clefable();
        PonytadeGalar ponytadegalarSalvaje = new PonytadeGalar();
        Squirtle squirtleSalvaje = new Squirtle();
        Bullbasaur bullbasaurSalvaje = new Bullbasaur();

        Entrenador en1 = new Entrenador("Quique");
        en1.capturarPokemon(squirtleSalvaje);
        en1.capturarPokemon(charmanderSalvaje);
        
        Entrenador en2 = new Entrenador("Paola");
        en2.capturarPokemon(clefableSalvaje);
        en2.capturarPokemon(ponytadegalarSalvaje);
        
        Batalla b = new Batalla(en1, en2);
                b.desarrollarBatalla();
    }
}
