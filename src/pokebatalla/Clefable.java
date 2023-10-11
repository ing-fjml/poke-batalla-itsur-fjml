/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla;

import java.util.ArrayList;

/**
 *
 * @author Hannia Dinora González Magaña
 */
public class Clefable extends Pokemon {
    public Clefable(){
        tipo = "HADA";
        hp =95 ;
        ataque = 70;
        defensa = 73;
        nivel = 1;
        precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("CABEZAZO ZEN");
        this.habilidades.add("FUERZA LUNAR");
        //....
    }    
    
    //Constructor alterno 1
    public Clefable(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("CABEZAZO ZEN")){
            System.out.println("Realizando CABEZAZO ZEN");
        }
        else if(habilidad.equals("FUERZA LUNAR")){
            System.out.println("Realizando FUERZA LUNAR");            
        }
        //TODO: otras habilidades...
    }
}

    
        
