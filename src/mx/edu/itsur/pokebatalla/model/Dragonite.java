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
public class Dragonite extends Pokemon {
     
    public Dragonite() {
        this.tipo = "DRAGÓN";
        this.hp = 91;
        this.ataque = 134;
        this.defensa = 95;
        this.nivel = 1;
        this.precision = 3;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("ATAQUE ALA");
        this.habilidades.add("PUÑO TRUENO");
        
    }    
    
    
    public Dragonite(String nombre){
        this(); 
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("ATAQUE ALA")){
           
            System.out.println("Realizando ATAQUE ALA");
        }else if(habilidad.equals("PUÑO TRUENO")){
          
            System.out.println("Realizando PUÑO TRUENO");            
        }
   
    }
    
    
}
