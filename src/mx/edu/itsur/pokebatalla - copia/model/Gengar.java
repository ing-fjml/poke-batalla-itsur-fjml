package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;


public class Gengar  extends Pokemon{


    public Gengar() {
        this.tipo = "FANTASMA/VENENO";
        this.hp = 60;
        this.ataque = 65;
        this.defensa = 60;
        this.nivel = 1;
        this.precision = 5;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("CARASUSTO");
        this.habilidades.add("GARRAUMBRIA");
        
    }    
    
    public Gengar(String nombre){
        this(); 
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("CARASUSTO")){
            System.out.println("Realizando CARASUSTO");
        }else if(habilidad.equals("GARRAUMBRIA")){
            System.out.println("Realizando GARRAUMBRIA");            
        }
 
    }
   
}