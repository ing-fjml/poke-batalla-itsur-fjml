/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla;
import pokebatalla.pookemones.Bullbasaur;
import pokebatalla.pookemones.Charmander;
import pokebatalla.pookemones.Clefable;
import pokebatalla.pookemones.PonytadeGalar;
import pokebatalla.pookemones.Squirtle;

/**
 *
 ** @author Hannia Dinora Gonzalez Magaña
 */
public class MAIN {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
        
        Charmander charmanderSalvaje = new Charmander() ;
        Clefable clefableSalvaje = new Clefable() ;
        PonytadeGalar ponytadegalarSalvaje = new PonytadeGalar() ;
        Squirtle squirtleSalvaje = new Squirtle() ;
        Bullbasaur bullbasaurSalvaje = new Bullbasaur() ;
        
        System.out.println("->Charmander se encuentra con un Clefable y ataca");
        charmanderSalvaje.atacar(clefableSalvaje, Charmander.Movimientos.ATAQUE_RAPIDO);
        
        System.out.println("->Clefable se molesta y responde ");
        clefableSalvaje.atacar(charmanderSalvaje, Clefable.Movimientos.PSIQUICO);
     
        System.out.println("->Bullbasaur se enoja porque atacaron a su amigo Chamander y...");
        bullbasaurSalvaje.atacar(clefableSalvaje, Bullbasaur.Movimientos.LATIGO);
        
        System.out.println("->Ponyta de Galar se encuentra con un Squirtle y ataca");
        ponytadegalarSalvaje.atacar(squirtleSalvaje, PonytadeGalar.Movimientos.CONFUSION);
    }
    }
    

    

