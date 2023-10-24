/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.pookemones;



import pokebatalla.Movimientos.Placaje;
import pokebatalla.Movimientos.Burbuja;
import pokebatalla.Movimientos.Refugio;
import pokebatalla.Movimientos.Movimiento;

/**
 *
 * @author Hannia Dinora González Magaña
 */
public class Squirtle extends Pokemon {
    

    public enum Movimientos {
       PLECAJE,
       BURBUJA,
       REFUGIO
}
    public Squirtle(){
        tipo = "AGUA";
        hp =44 ;
        ataque = 48;
        defensa = 65;
        nivel = 1;
        precision = 4;
       
    }    
    
    //Constructor alterno 1
    public Squirtle(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public void atacar(Squirtle oponente, Squirtle.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
        case PLECAJE:
        instanciaMovimiento = new Placaje();
         break;
        case BURBUJA:
        instanciaMovimiento = new Burbuja();
        break;
        case REFUGIO:
        instanciaMovimiento = new Refugio();
        break;

    }

    }
}


