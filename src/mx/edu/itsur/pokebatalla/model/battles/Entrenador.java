/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.battles;

import java.util.List;
import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

/**
 *
 * @author Francisco Gonzalez Regalado
 */

public class Entrenador {

   
    protected String nombre;
    protected List<Pokemon> pokemonsCapturados;
    protected Pokemon pokemonActual;

 
    public Entrenador(String nombre) {
        this.nombre = nombre;
        pokemonsCapturados = new ArrayList<>();
    }


    public void capturarPokemon(Pokemon pk) {
        pokemonsCapturados.add(pk);
    }

 
    public void instruirMovimientoAlPokemonActual(Pokemon oponente, int ordinalMovimiento)
    {
        this.pokemonActual.atacar(oponente, ordinalMovimiento);
    }

    //Devuelve true cuando todos los Pokemon del entrenador esten Debilitados
    public boolean estaDerrotado() 
    {
        int sumaHP = 0;
        for (Pokemon pokemon : pokemonsCapturados) {
            sumaHP += pokemon.getHp();
        }
        
        return (sumaHP <= 0);
    }

    //Getters y Setters
    public String getNombre(){
        return nombre;
    }

    public Pokemon getPokemonActual(){
        return this.pokemonActual;
    }

    public void setPokemonActual(Pokemon p){
        this.pokemonActual = p;
    }

    public List<Pokemon> getPokemonsCapturados(){
        return this.pokemonsCapturados;
    }    
    
}
