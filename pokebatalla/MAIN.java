/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla;

import java.io.Serializable;
import pokebatalla.model.battels.Batalla;
import pokebatalla.model.battels.Entrenador;
import pokebatalla.model.pokemons.Bullbasaur;
import pokebatalla.model.pokemons.Charmander;
import pokebatalla.model.pokemons.Clefable;
import pokebatalla.model.pokemons.PonytadeGalar;
import pokebatalla.model.pokemons.Squirtle;
import pokebatalla.model.utils.fildeManager;
/**
 *
 ** @author Hannia Dinora Gonzalez Magaña
 */
public class main implements Serializable{

    public static void main(String[] args) {
        
        Batalla b = fildeManager.leerPartida();
        
        if (b== null) {
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

        b = new Batalla(en1, en2);
         }
                
        b.desarrollarBatalla();
        
    }
}
