/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.PicoTaladro;
import mx.edu.itsur.pokebatalla.model.moves.Trueno;
import mx.edu.itsur.pokebatalla.model.moves.OndaTrueno;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import java.util.ArrayList;

/**
 *
 * @author Jose Guadalupe Salgado Garcia
 */
public class Zapdos extends Pokemon{
    
        public enum Movimientos {
        PICO_TALADRO,
        TRUENO,
        ONDA_TRUENO
        
    }
    public Zapdos() {
        tipo = "ELECTRICO/VOLADOR";
        hp = 90;
        ataque = 90;
        defensa = 75;
        nivel = 1;
        precision = 5;
    }
    
        public Zapdos (String nombre){
        this();
        this.nombre = nombre;
    }

        @Override
    public Enum[] getMovimientos() {
        return Zapdos.Movimientos.values();
    }    
    
    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        //Si el pokemon está agotado no podrá realizar nada.
        if (this.hp <= 0) {
            System.out.println("Zapdos esta agotado y no puede realizar mas movimientos.");
            return;
        }        
        
        //Obtener el movimiento de acuerdo a su numero ordinal
        Zapdos.Movimientos movimientoAUtilizar = 
                Zapdos.Movimientos.values()[ordinalMovimiento];
        
        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case PICO_TALADRO:
                instanciaMovimiento = new PicoTaladro();
                break;
            case ONDA_TRUENO:
                instanciaMovimiento = new OndaTrueno();
                break;
            //Otros movimientos aquí...
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento
        instanciaMovimiento.utilizar(this, oponente);
        
    }
    
}
