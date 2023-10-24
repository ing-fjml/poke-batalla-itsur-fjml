/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.pookemones;

import pokebatalla.Movimientos.Confusion;
import pokebatalla.Movimientos.Gruñido;
import pokebatalla.Movimientos.Pisoton;
import pokebatalla.Movimientos.Movimiento;

/**
 *
 * @author Hannia Dinora González Magaña
 *//**
 *
 * @author Hannia Dinora González Magaña
 */
public class PonytadeGalar extends Pokemon {
    public enum Movimientos {
       CONFUSION,
       GRUÑIDO,
       PISOTON
    }
    public PonytadeGalar(){
        tipo = "PSIQUICO";
        hp =50 ;
        ataque = 85;
        defensa = 55;
        nivel = 1;
        precision = 4;
        
        //....
    }    
    
    //Constructor alterno 1 confusion gruñigo pisoton
    public PonytadeGalar(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    public void atacar(Pokemon oponente, PonytadeGalar.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case CONFUSION:
                instanciaMovimiento = new Confusion();
                break;
            case GRUÑIDO:
                instanciaMovimiento = new Gruñido();
                break;
            case PISOTON:
                instanciaMovimiento = new Pisoton();
                break;

        }

    }
}

    

