/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;

/**
 *
 * @author Fatima Gutierrez Moreno
 */
public class Squirtle extends Pokemon {
   
    public Squirtle() {
        this.tipo = "AGUA";
        this.hp = 44;
        this.ataque = 48;
        this.defensa = 65;
        this.nivel = 1;
        this.precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("BURBUJA");
        this.habilidades.add("REFUGIO");
        
    }    
    
   
    public Squirtle(String nombre){
        this();
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("BURBUJA")){
           
            System.out.println("Realizando BURBUJA");
        }else if(habilidad.equals("REFUGIO")){
          
            System.out.println("Realizando REFUGIO");            
        }
      
    }
    
}
