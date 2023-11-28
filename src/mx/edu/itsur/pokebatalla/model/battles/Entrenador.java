/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.battles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

/**
 *
 * @author Brayan Eduardo González Parra
 */
public class Entrenador implements Serializable {

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

    public void instruirMovimientoAlPokemonActual(Pokemon oponente, int ordinalMovimiento) {
        if (pokemonActual != null) {
            pokemonActual.atacar(oponente, ordinalMovimiento);
        } else {
            System.out.println("No hay un Pokémon actual seleccionado para realizar un movimiento.");
        }

    }

    public boolean estaDerrotado() {
        int sumaHP = 0;
        for (Pokemon pokemon : pokemonsCapturados) {
            sumaHP += pokemon.getHp();
        }

        return (sumaHP <= 0);
    }

    public String getNombre() {
        return nombre;
    }

    public Pokemon getPokemonActual() {
        return this.pokemonActual;
    }

    public void setPokemonActual(Pokemon p) {
        this.pokemonActual = p;
    }

    public List<Pokemon> getPokemonsCapturados() {
        return this.pokemonsCapturados;
    }

}
