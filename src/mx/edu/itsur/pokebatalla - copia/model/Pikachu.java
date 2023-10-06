/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;

/**
 *
 * @author FJML1983
 */
public class Pikachu  extends Pokemon{

    //Constructor default
    public Pikachu() {
        this.tipo = "ELECTRICO";
        this.hp = 35;
        this.ataque = 55;
        this.defensa = 30;
        this.nivel = 1;
        this.precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("ATACKTRUENO");
        this.habilidades.add("BOLAVOLTIO");
        //....
    }    
    
    //Constructor alterno 1
    public Pikachu(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("ATACKTRUENO")){
            //Logica del daño por atacktrueno
            System.out.println("Realizando ATACKTRUENO");
        }else if(habilidad.equals("BOLAVOLTIO")){
            //Logica del daño por BOLAVOLTIO
            System.out.println("Realizando BOLAVOLTIO");            
        }
        //TODO: otras habilidades...
    }
   
}
