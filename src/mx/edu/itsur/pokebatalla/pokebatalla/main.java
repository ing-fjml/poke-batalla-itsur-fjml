/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokebatalla;

import battles.Batalla;
import battles.Entrenador;
import pokemons.Bullbasaur;
import pokemons.Charmander;
import pokemons.Dragonite;
import pokemons.Oddish;
import pokemons.Pikachu;
import pokemons.Squirtle;
import serializacionDeObjetosYArchivos.FileManager;

/**
 *
 * @author Fatima Gutierrez Moreno
 */
public class main {

   
    public static void main(String[] args) {
         
        Batalla k = FileManager.leerDesdeArchivo();

        System.out.println("Hello PokeBatalla!");

         Oddish suga= new Oddish("suga");
        Dragonite guason = new Dragonite("guason");
        Squirtle azul = new Squirtle(" azul");
         Charmander blackPink = new Charmander ("blackPink");
         Pikachu lila = new Pikachu ("lilaa");
          Bullbasaur Bubalubu= new Bullbasaur("Bubalubu");
          
          Entrenador entrenador1 = new Entrenador("J-Hope");
       entrenador1.capturarPokemon(suga);
       entrenador1.capturarPokemon(guason);
               
       
       Entrenador entrenador2 = new Entrenador("Jungkook");
       entrenador2.capturarPokemon(azul);
       entrenador2.capturarPokemon(blackPink);
       
       Batalla batalla = new Batalla(entrenador1, entrenador2);
       batalla.desarrollarBatalla();
        
    }
    }
    

