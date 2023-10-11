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
public class Squirtle extends Pokemon {
    public Squirtle(){
        tipo = "AGUA";
        hp =44 ;
        ataque = 48;
        defensa = 65;
        nivel = 1;
        precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("BURBUJA");
        this.habilidades.add("ACUA COLA");
        //....
    }    
    
    //Constructor alterno 1
    public Squirtle(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("BURBUJA")){
            System.out.println("Realizando BURBUJA");
        }
        else if(habilidad.equals("ACUA COLA")){
            System.out.println("Realizando ACUA COLA");            
        }
        //TODO: otras habilidades...
    
}
    }

