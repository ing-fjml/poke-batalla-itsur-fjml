/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.pookemones;



import pokebatalla.Movimientos.Psiquico;
import pokebatalla.Movimientos.Destello;
import pokebatalla.Movimientos.MegaPuño;
import pokebatalla.Movimientos.Movimiento;

/**
 *
 * @author Hannia Dinora González Magaña
 */
public class Clefable extends Pokemon {
    public enum Movimientos {
       PSIQUICO,
       DESTELLO,
       MEGAPUÑO
    }
        
    public Clefable(){
        tipo = "HADA";
        hp =95 ;
        ataque = 70;
        defensa = 73;
        nivel = 1;
        precision = 4;
    }    
    
    
    //Constructor alterno 1 psiquico destello megapuño
    public Clefable(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
     public void atacar(Pokemon oponente, Clefable.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
        case PSIQUICO:
        instanciaMovimiento = new Psiquico();
        break;
        case DESTELLO:
        instanciaMovimiento = new Destello();
        break;
        case MEGAPUÑO:
        instanciaMovimiento = new MegaPuño();
        break;

        }


    }
}