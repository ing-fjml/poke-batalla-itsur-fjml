/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

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
        
        //Pelea creada por la organizadora Fatima :)
        //Despues de la anterior pelea se decidio realizar otro encuentro entre estos
        //nuevos pokemones...La pelea comenzara en 1,2,3...Y estos son los pokemones 
        //que estaran en el  ring esta noche, disfrute de la pelea y apueste por su favorito...:)
        Squirtle blue=new Squirtle();
        Dragonite turbo=new Dragonite();
        Oddish cookie=new Oddish();
        
         System.out.println("->Squirtle se encuentra en el ring con Dragonite y ataca");
        blue.atacar(turbo, Squirtle.Movimientos.Cascada.ordinal());
        
         System.out.println("->Dragonite se molesto por ese tremendo golpe y responde ");
        turbo.atacar(blue, Dragonite.Movimientos.Furia_Dragon.ordinal());
        
        System.out.println("->OOOH...Oddish se molesto porque ese movimiento no le parecio justo "
                + "y interviene en la pelea , esto se puso muy interesante...");
        cookie.atacar(turbo, Oddish.Movimientos.Danza_Petalo.ordinal());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
