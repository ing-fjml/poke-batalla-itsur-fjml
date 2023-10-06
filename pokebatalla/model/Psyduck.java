package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;


public class Psyduck  extends Pokemon{


    public Psyduck() {
        this.tipo = "AGUA";
        this.hp = 50;
        this.ataque = 52;
        this.defensa = 48;
        this.nivel = 1;
        this.precision = 5;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("PISTOLAAGUA");
        this.habilidades.add("HIDROPULSO");
        
    }    
    
 
    public Psyduck(String nombre){
        this(); 
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("PISTOLAAGUA")){
            System.out.println("Realizando PISTOLAAGUA");
        }else if(habilidad.equals("HIDROPULSO")){
            System.out.println("Realizando HIDROPULSO");            
        }
        
    }
   
}