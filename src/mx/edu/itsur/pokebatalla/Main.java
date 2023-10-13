/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.Pikachu;
import mx.edu.itsur.pokebatalla.model.Charmander;
import mx.edu.itsur.pokebatalla.model.Clefairy;
import mx.edu.itsur.pokebatalla.model.Dragonite;
import mx.edu.itsur.pokebatalla.model.Squirtle;

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
        
        Pikachu pikachuSalvaje = new Pikachu();
        Charmander charmanderSalvaje = new Charmander() ;
        Squirtle squirSalvaje=new  Squirtle ();
        Clefairy clefaSalvaje=new Clefairy();
        Dragonite dragoSalvaje=new Dragonite();
        Bullbasaur bullSalvaje=new Bullbasaur();
        
        
        
        //Realizar la captura del pikachu salvaje
        pikachuSalvaje.setNombre("Pedro");        
        Pikachu miPikachu = pikachuSalvaje;
        
        miPikachu.atacar(charmanderSalvaje);
        
        miPikachu.atacar(charmanderSalvaje, "ATACKTRUENO");
        
        //Pelea entre  Bullbasaur y Squirtle
        
        squirSalvaje.setNombre("AGUITA");
         Squirtle aguita= squirSalvaje;
         
         aguita.atacar(bullSalvaje);
         aguita.atacar(bullSalvaje, "BURBUJA");
         
         bullSalvaje.setNombre("BULLBU");
         Bullbasaur bullbu=bullSalvaje;
         
         bullbu.atacar(aguita);
         bullbu.atacar(aguita, "DOBLE FILO");
                 
         
         //Pelea entre  Clefairy y Dragonite
         clefaSalvaje.setNombre("Clef");
         Clefairy clef=clefaSalvaje;
         
         clef.atacar(dragoSalvaje);
         clef.atacar(dragoSalvaje, "BESO DRENAJE");
         
        
         dragoSalvaje.setNombre("Draco");
        Dragonite draco=dragoSalvaje;
         
        draco.atacar(clefaSalvaje);
        draco.atacar(clefaSalvaje, "ATAQUE ALA");
        
         
         
         
         
        
        
    }
    
}
