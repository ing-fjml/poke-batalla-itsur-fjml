/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.battles;

import java.util.ArrayList;
import java.util.List;
import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

/**
 *
 * @author fatima gutierrez moreno
 */
public class Entrenador {
    String nombre;
    List<Pokemon> pokemonsAgregados;
    Pokemon pokemonActual;
    
    public Entrenador(String nombre){
        this.nombre = nombre;
        this.pokemonsAgregados = new ArrayList<>();
        this.pokemonsAgregados = new ArrayList<>();
    }
    
    public boolean capturarPokemon(Pokemon p){
        return pokemonsAgregados.add(p);
    }
    
    public void instruirMovimientoAlPokemonActual(Pokemon oponente, int ordinalMovimiento){
        if(pokemonActual == null){
            System.out.println("No  seleccionaste aun a ningun pokemon");
            return;
        }
        
        if(ordinalMovimiento < 0 || ordinalMovimiento >= pokemonActual.getMovimientos().length){
            System.out.println("No es  valido");
            return;
        }
        this.pokemonActual.atacar(oponente, ordinalMovimiento);
    }
    
    public boolean estaDerrotado(){
        for(Pokemon pokemon : pokemonsAgregados){
            if(pokemon.getHp() > 0){
                return false;
            }
        }
        return true;
    }
    //Getters y Setters
    public String getNombre(){
        return nombre;
    }
    
    public Pokemon getPokemonActual(){
        return pokemonActual;
    }
    
    public void setPokemonActual(Pokemon p){
        this.pokemonActual = p;
    }
    
    public List<Pokemon> getPokemonsCapturados(){
        return pokemonsAgregados;
    }
}
