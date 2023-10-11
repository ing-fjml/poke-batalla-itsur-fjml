/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla;

/**
 *
 *
 */
public class MAIN {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
        
        Pikachu pikachuSalvaje = new Pikachu();
        Charmander charmanderSalvaje = new Charmander() ;
        Clefable clefableSalvaje = new Clefable() ;
        PonytadeGalar ponytadegalarSalvaje = new PonytadeGalar() ;
        Squirtle squirtleSalvaje = new Squirtle() ;
        Bullbasaur bullbasaurSalvaje = new Bullbasaur() ;
        
        //Realizar la captura del pikachu salvaje
        pikachuSalvaje.setNombre("Juanito");        
        Pikachu miPikachu = pikachuSalvaje;
        miPikachu.atacar(charmanderSalvaje);
        miPikachu.atacar(charmanderSalvaje, "ATACKTRUENO");
        
        ////
        charmanderSalvaje.setNombre("Mario");        
        Charmander miCharmander = charmanderSalvaje;
        miCharmander.atacar(pikachuSalvaje);
        miCharmander.atacar(pikachuSalvaje, "ASCUAS");
        
        //
        bullbasaurSalvaje.setNombre("Chucha");        
        Bullbasaur miBullbasaur = bullbasaurSalvaje;
        miBullbasaur.atacar(clefableSalvaje);
        miBullbasaur.atacar(clefableSalvaje, "LATIGO");
        
        //
        clefableSalvaje.setNombre("Alexis");        
        Clefable miClefable = clefableSalvaje;
        miClefable.atacar(bullbasaurSalvaje);
        miClefable.atacar(bullbasaurSalvaje, "CABEZAZO ZEN");
        
        //
        ponytadegalarSalvaje.setNombre("Ana");        
        PonytadeGalar miPonytadeGalar = ponytadegalarSalvaje;
        miPonytadeGalar.atacar( squirtleSalvaje);
        miPonytadeGalar.atacar( squirtleSalvaje, "PSICORRAYO");
        //
        // //
        squirtleSalvaje.setNombre("Marrana");        
        Squirtle miSquirtle = squirtleSalvaje;
        miSquirtle.atacar(ponytadegalarSalvaje);
        miSquirtle.atacar(ponytadegalarSalvaje, "ACUA COLA");
    }
    
}

