
package pokebatalla;

import java.util.ArrayList;

/**
 *
 * @author FJML1983
 */
public class Charmander extends Pokemon {
    public Charmander(){
        tipo = "FUEGO";
        hp = 39;
        ataque = 52;
        defensa = 43;
        nivel = 1;
        precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("ASCUAS");
        this.habilidades.add("LANZALLAMAS");
    }
    
    //Constructor alterno 1
    public Charmander(String nombre){
        
        
        
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
     public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("ASCUAS")){
          
            System.out.println("Realizando ASCUAS");
        }
        else if(habilidad.equals("LANZALLAMAS")){
            
            System.out.println("Realizando LANZALLAMAS");            
        }
     }
}
    
    


