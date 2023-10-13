/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;

/**
 *
 * @author Fatima Gutierrez Moreno
 */
public class Bullbasaur extends Pokemon {

        public Bullbasaur() {
        this.tipo = "PLANTA/VENENO";
        this.hp = 45;
        this.ataque = 49;
        this.defensa = 49;
        this.nivel = 1;
        this.precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("TOXICO");
        this.habilidades.add("DOBLE FILO");
        
    }    
    
    
    public Bullbasaur (String nombre){
        this(); 
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("TOXICO")){
           
            System.out.println("Realizando ATAQUE TOXICO");
        }else if(habilidad.equals("DOBLE FILO")){
          
            System.out.println("Realizando ATAQUE DOBLE FILO");            
        }
   
    }
    

   
    
    
    
}
