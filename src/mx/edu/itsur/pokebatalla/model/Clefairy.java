/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;

/**
 *
 * @Fatima Gutierrez Moreno
 */
public class Clefairy extends Pokemon{
  
    public Clefairy() {
        this.tipo = "HADA";
        this.hp = 70;
        this.ataque = 45;
        this.defensa = 48;
        this.nivel = 1;
        this.precision = 5;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("BESO DRENAJE");
        this.habilidades.add("BRILLO MAGICO");
        
    }    
    
   
    public Clefairy(String nombre){
        this();
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("BESO DRENAJE")){
           
            System.out.println("Realizando BESO DRENAJE");
        }else if(habilidad.equals("BRILLO MAGICO")){
          
            System.out.println("Realizando BRILLO MAGICO");            
        }
      
    }
    
}
