/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmander;
///////////////////////////////////////////////////////////
import mx.edu.itsur.pokebatalla.model.pokemons.Snorlax;
import mx.edu.itsur.pokebatalla.model.pokemons.Psyduck;
import mx.edu.itsur.pokebatalla.model.pokemons.Gengar;

/**
 *
 * @author JORGE OSVIEL ALVAREZ MEDINA  
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hola PokeBatalla!");

        Pikachu pika = new Pikachu();
        Charmander charm = new Charmander();
        Bullbasaur bullb = new Bullbasaur();

        System.out.println("->Pikachu se encuentra con un Charmander y ataca");
        pika.atacar(charm, Pikachu.Movimientos.IMPACTRUENO.ordinal());

        System.out.println("------------------------------------------------------");

        System.out.println("->Charmander se molesta y responde ");
        charm.atacar(pika, Charmander.Movimientos.ATAQUE_RAPIDO.ordinal());

        System.out.println("------------------------------------------------------");

        System.out.println("->Bullbasaur se enoja porque atacaron a su amigo Pikachu y...");
        bullb.atacar(charm, Bullbasaur.Movimientos.LATIGO.ordinal());

        System.out.println("------------------------------------------------------");
        Snorlax snow = new Snorlax();
        Psyduck psy = new Psyduck();
        Gengar Geng = new Gengar();

        System.out.println("->Charmander va caminando  y  se encuentra con un Snorlax,"
                + " charmander lo ataca");
        charm.atacar(snow, Charmander.Movimientos.ATAQUE_RAPIDO.ordinal());

        System.out.println("------------------------------------------------------");

        System.out.println("->Snorlax se molesta y tambien ataca ");
        snow.atacar(psy, Snorlax.Movimientos.MALICIOSO.ordinal());

        System.out.println("------------------------------------------------------");

        System.out.println("->Gengar se mete a la pelea porque estan "
                + "dandole una golpisa a Snorlax y ataca...");
        Geng.atacar(snow
                , Gengar.Movimientos.BOLA_SOMBRA.ordinal());

    }

}
