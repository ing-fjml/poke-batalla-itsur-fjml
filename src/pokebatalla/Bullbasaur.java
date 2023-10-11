/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla;

import java.util.ArrayList;

/**
 *
 * 
 */
public class Bullbasaur extends Pokemon {
      public Bullbasaur() {
        tipo = "PLANTA/VENENO";
        hp = 45;
        ataque = 49;
        defensa = 49;
        nivel = 1;
        precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("LATIGO");
        this.habilidades.add("LATIGAZO");
    }

    //Constructor alterno 1
    public Bullbasaur(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
      public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("LATIGO")){
          
            System.out.println("Realizando LATIGO");
        }
        else if(habilidad.equals("LATIGAZO")){
            
            System.out.println("Realizando LATIGAZO");            
        }
     }
    
    
}
    
