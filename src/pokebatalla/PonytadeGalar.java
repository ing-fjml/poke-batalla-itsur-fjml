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
public class PonytadeGalar extends Pokemon {
    public PonytadeGalar(){
        tipo = "PSIQUICO";
        hp =50 ;
        ataque = 85;
        defensa = 55;
        nivel = 1;
        precision = 4;
         this.habilidades = new ArrayList<>();
        this.habilidades.add("PSICOCORTE");
        this.habilidades.add("PSICORRAYO");
        //....
    }    
    
    //Constructor alterno 1
    public PonytadeGalar(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("PSICOCORTE")){
            System.out.println("Realizando PSICOCORTE");
        }
        else if(habilidad.equals("PSICORALLO")){
            System.out.println("Realizando PSICORALLO");            
        }
        //TODO: otras habilidades...
    }
}

    

