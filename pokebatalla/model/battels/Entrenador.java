/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.model.battels;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import pokebatalla.model.pokemons.Pokemon;

/**
 *
 * @author  Hannia Dinora Gonzalez Magaña
 */
public class Entrenador implements Serializable {
     protected String nombre;
    protected List<Pokemon> pokemonsCapturados;
    protected Pokemon pokemonActual;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemonsCapturados = new ArrayList<>();
        this.pokemonsCapturados = new ArrayList<>();
    }

    public boolean capturarPokemon(Pokemon p) {
        return pokemonsCapturados.add(p);
    }


    public void instruirMovimientoAlPokemonActual(Pokemon oponente, int ordinalMovimiento) {
        
        if (pokemonActual == null) {
            System.out.println("No tienes un Pokémon seleccionado.");
            return;
        }

        if (ordinalMovimiento < 0 || ordinalMovimiento >= pokemonActual.getMovimientos().length) {
            System.out.println("El ordinal de movimiento no es válido.");
            return;
        }
        // Llamar al metodo atacar del Pokemon actual
        this.pokemonActual.atacar(oponente, ordinalMovimiento);
    }
    

    public boolean estaDerrotado() {
        for (Pokemon pokemon : pokemonsCapturados) {

            if (pokemon.gethp() > 0) {
                return false;
            }
        }
        return true;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public Pokemon getPokemonActual() {
        return pokemonActual;
    }

    public void setPokemonActual(Pokemon p) {
       this. pokemonActual = p;
    }

    public List<Pokemon> getPokemonsCapturados() {
        return pokemonsCapturados;
    }
}
