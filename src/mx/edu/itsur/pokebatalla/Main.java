/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.Pikachu;
import mx.edu.itsur.pokebatalla.model.Articuno;
import mx.edu.itsur.pokebatalla.model.Charmander;
import mx.edu.itsur.pokebatalla.model.Moltres;
import mx.edu.itsur.pokebatalla.model.Zapdos;
/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
        
        Pikachu pikachuSalvaje = new Pikachu();
        Charmander charmanderSalvaje = new Charmander();
        Bullbasaur bullbasaurSalvaje = new Bullbasaur();
        Articuno articunoSalvaje = new Articuno();
        Moltres moltresSalvaje = new Moltres();
        Zapdos zapdosSalvaje = new Zapdos();
        
        //Realizar la captura del pikachu salvaje   
        pikachuSalvaje.setNombre("Pikachu");
        charmanderSalvaje.setNombre("Charmander");
        articunoSalvaje.setNombre("Articuno");
        zapdosSalvaje.setNombre("Zapdos");
        
        Pikachu miPikachu = pikachuSalvaje;
        Articuno miArticuno = articunoSalvaje;
        Moltres miMoltres = moltresSalvaje;
        
        miPikachu.atacar(charmanderSalvaje);
        miPikachu.atacar(charmanderSalvaje, "ATACKTRUENO");
        
        miArticuno.atacar1(zapdosSalvaje);
        miArticuno.atacar(zapdosSalvaje, "RAYOHIELO");
        
        miMoltres.atacar2(articunoSalvaje);
        miMoltres.atacar(articunoSalvaje, "ATAQUEAEREO");
    }
}
