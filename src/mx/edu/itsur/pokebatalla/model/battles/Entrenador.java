/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.battles;

import java.util.List;
import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

/**
 *
 * @author FJML1983
 */
public class Entrenador {
    //Atributos
    protected List<Pokemon> pokemonsCapturados;
    
    //Metodos
    public void capturarPokemon(Pokemon pk){
        pokemonsCapturados.add(pk);
    }
    
}
