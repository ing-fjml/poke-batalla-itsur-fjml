/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmander;

/**
 *
 * @author FJML1983
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
        
        Pikachu pika = new Pikachu();
        Charmander charm = new Charmander();
        Bullbasaur bullb = new Bullbasaur();
                
        System.out.println("->Pikachu se encuentra con un Charmander y ataca");
        pika.atacar(charm, Pikachu.Movimientos.IMPACTRUENO.ordinal());
        
        System.out.println("->Charmander se molesta y responde ");
        charm.atacar(pika, Charmander.Movimientos.ATAQUE_RAPIDO.ordinal());
     
        System.out.println("->Bullbasaur se enoja porque atacaron a su amigo Pikachu y...");
        bullb.atacar(charm, Bullbasaur.Movimientos.LATIGO.ordinal());
        
    }
    
}
