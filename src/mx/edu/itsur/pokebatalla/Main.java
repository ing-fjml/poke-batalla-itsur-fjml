/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.battles.Batalla;
import mx.edu.itsur.pokebatalla.model.battles.Entrenador;
import mx.edu.itsur.pokebatalla.model.pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmander;
import mx.edu.itsur.pokebatalla.model.pokemons.Dragonite;
import mx.edu.itsur.pokebatalla.model.pokemons.Oddish;
import mx.edu.itsur.pokebatalla.model.pokemons.Squirtle;

/**
 *
 * @author Fatima Gutierrez Moreno
 */
public class Main {
    
    public static void main(String[] args) {

        System.out.println("Hello PokeBatalla!");

         Oddish suga= new Oddish("suga");
        Dragonite guason = new Dragonite("guason");
        Squirtle azul = new Squirtle(" azul");
         Charmander pink = new Charmander ("pink");
         Pikachu Pika = new Pikachu ("pika");
          Bullbasaur Bull= new Bullbasaur("BUll");
          
          Entrenador entrenador1 = new Entrenador("J-Hope");
       entrenador1.capturarPokemon(suga);
       entrenador1.capturarPokemon(guason);
               
       
       Entrenador entrenador2 = new Entrenador("Jungkook");
       entrenador2.capturarPokemon(azul);
       entrenador2.capturarPokemon(pink);
       
       Batalla batalla = new Batalla(entrenador1, entrenador2);
       batalla.desarrollarBatalla();
        
    }
}

    
