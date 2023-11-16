/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.battles;
import java.util.List;
import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

/**
 *
 * @author osviel.AM
 */
public class Entrenador {
    //Atributos
    protected String nombre;
    protected List<Pokemon> pokemonsCapturados;
    protected Pokemon pokemonActual;
    
    //constructor
    public Entrenador(String nombre){
        this.nombre=nombre;
    }
    //metodos
    public void capturarPokemon(Pokemon pk) {
       pokemonsCapturados.add(pk);
    }
    public void instruirMovimientoAlPokemonActual(Pokemon oponente, int ordinalMovimiento){
    if (pokemonActual != null) {
            pokemonActual.atacar(oponente, ordinalMovimiento);
        }
    }
    
     public boolean estaDerrotado() {
        // Verifica si todos los Pokémon del entrenador tienen 0 HP
        for (Pokemon pokemon : pokemonsCapturados) {
            if (pokemon.getHP() > 0) {
                return false; // Si al menos un Pokémon tiene HP mayor que 0, el entrenador no está derrotado
            }
        }
        return true; // Si todos los Pokémon tienen 0 HP, el entrenador está derrotado
    }
    
    //GYS

    public String getNombre() {
        return nombre;
    }

    public List<Pokemon> getPokemonsCapturados() {
        return pokemonsCapturados;
    }

    public Pokemon getPokemonActual() {
        return pokemonActual;
    }

    public void setPokemonActual(Pokemon pokemonActual) {
        this.pokemonActual = pokemonActual;
    }
    
    
}
