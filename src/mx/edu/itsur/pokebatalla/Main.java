package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmander;

import mx.edu.itsur.pokebatalla.model.pokemons.Psyduck;
import mx.edu.itsur.pokebatalla.model.pokemons.Snorlax;
import mx.edu.itsur.pokebatalla.model.pokemons.Gengar;

/**
 *
 * @author JORGE OSVIEL ALVAREZ MEDINA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
System.out.println("-----------------------------------------------------------------------------");
        //declarando los pokemones mios 
        Psyduck psyd = new Psyduck();
        Snorlax snor = new Snorlax();
        Gengar geng = new Gengar();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("->Snorlax se encuentra con un Psyduck y ataca");
        snor.atacar(psyd, Snorlax.Movimientos.MALICIOSO);
System.out.println("-----------------------------------------------------------------------------");
        System.out.println("->Psyduck se molesta y responde ");
        psyd.atacar(snor, Psyduck.Movimientos.CONFUSION);
System.out.println("-----------------------------------------------------------------------------");
        System.out.println("->gengar se enoja porque atacaron a su amigo Psyduck y...");
        geng.atacar(snor, Gengar.Movimientos.BOLASOMBRA);
        System.out.println("-----------------------------------------------------------------------------");
    }
}
