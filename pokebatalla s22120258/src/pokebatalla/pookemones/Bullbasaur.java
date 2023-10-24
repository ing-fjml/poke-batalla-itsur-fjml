/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.pookemones;

import pokebatalla.Movimientos.AtaqueRapido;
import pokebatalla.Movimientos.Latigo;
import pokebatalla.Movimientos.Movimiento;

/**
 *
 * 
 */
public class Bullbasaur extends Pokemon {
     public enum Movimientos {
        ATAQUE_RAPIDO,
        LATIGO
    }

    public Bullbasaur() {
        tipo = "PLANTA/VENENO";
        hp = 45;
        ataque = 49;
        defensa = 49;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Bullbasaur(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;

    }
     public void atacar(Pokemon oponente, Bullbasaur.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
        case ATAQUE_RAPIDO:
        instanciaMovimiento = new AtaqueRapido();
        break;
        case LATIGO:
        instanciaMovimiento = new Latigo();
        break;

            //Otros movimientos aquí...
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento
        instanciaMovimiento.utilizar(this, oponente);

    }

}