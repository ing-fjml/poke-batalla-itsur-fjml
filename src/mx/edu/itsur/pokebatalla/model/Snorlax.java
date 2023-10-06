package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;


public class Snorlax  extends Pokemon{


    public Snorlax() {
        this.tipo = "NORMAL";
        this.hp = 160;
        this.ataque = 110;
        this.defensa = 65;
        this.nivel = 1;
        this.precision = 3;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("BOFETONLODO");
        this.habilidades.add("TERRATEMBLOR");
        
    }    
    
    public Snorlax(String nombre){
        this(); 
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("BOFETONLODO")){
            System.out.println("Realizando BOFETONLODO");
        }else if(habilidad.equals("TERRATEMBLOR")){
            System.out.println("Realizando TERRATEMBLOR");            
        }
 
    }
   
}