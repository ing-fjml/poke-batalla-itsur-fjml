
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.Pikachu;
import mx.edu.itsur.pokebatalla.model.Charmander;
import mx.edu.itsur.pokebatalla.model.Psyduck;
import  mx.edu.itsur.pokebatalla.model.Snorlax;
import  mx.edu.itsur.pokebatalla.model.Gengar;


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
        
        Pikachu pikachuSalvaje = new Pikachu();
        Charmander charmanderSalvaje = new Charmander() ;
        //declarando los pokemones mios 
        Psyduck psyduckSalvaje= new Psyduck();
        Snorlax snorlaxSalvaje= new Snorlax();
        Gengar gengarSalvaje= new Gengar();
        

        //Realizar la captura del pikachu salvaje
                 System.out.println("---------------------------------------------------");
        pikachuSalvaje.setNombre("Pedro");        
        Pikachu miPikachu = pikachuSalvaje;
        
        miPikachu.atacar(charmanderSalvaje);
        miPikachu.atacar(charmanderSalvaje, "ATACKTRUENO");
        ///captura de psyduck salvaje 
         psyduckSalvaje.setNombre("panchito");
         Psyduck miPsyduck = psyduckSalvaje;
     ///captura de Snorlax salvaje 
     snorlaxSalvaje.setNombre("avionado");
         Snorlax miSnorlax = snorlaxSalvaje;
             ///captura de Gengar salvaje 
           gengarSalvaje.setNombre("bolita");
         Gengar migengar = gengarSalvaje;
         System.out.println("---------------------------------------------------");
         //realizando batallas 
          miPsyduck.atacar(charmanderSalvaje);
        miPsyduck.atacar(charmanderSalvaje, "PISTOLAAGUA");
                 System.out.println("---------------------------------------------------");
          miSnorlax.atacar(pikachuSalvaje);
        miSnorlax.atacar(pikachuSalvaje, "TERRATEMBLOR");
                System.out.println("---------------------------------------------------");
            migengar.atacar(snorlaxSalvaje);
        migengar.atacar(snorlaxSalvaje, "CARASUSTO");
       
    } 
}


    
