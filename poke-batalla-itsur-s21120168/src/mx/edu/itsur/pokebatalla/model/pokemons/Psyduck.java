package mx.edu.itsur.pokebatalla.model.pokemons;

import java.util.ArrayList;

import mx.edu.itsur.pokebatalla.model.moves.Confusion;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.PistolaAgua;
import mx.edu.itsur.pokebatalla.model.moves.Placaje;


/**
 *
 * @author JORGE OSVIEL ALVAREZ MEDINA
 */

public class Psyduck extends Pokemon {

    public enum Movimientos {
        PLACAJE,
        CONFUSION,
        PISTOLA_AGUA,

        //Otros movimientos...
    }

    public Psyduck() {
        this.tipo = "AGUA";
        this.hp = 50;
        this.ataque = 52;
        this.defensa = 48;
        this.nivel = 1;
        this.precision = 5;
        
    }    

    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        
        if (this.hp <= 0) {
            System.out.println("El Pokemon esta agotado y no puede realizar mas movimientos");
            return;
        }
  Psyduck.Movimientos movimientoAUtilizar = Psyduck.Movimientos.values()[ordinalMovimiento];
        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        
        switch (movimientoAUtilizar) {
            case CONFUSION:
                instanciaMovimiento = new Confusion();
                break;
            case PISTOLA_AGUA:
                instanciaMovimiento = new PistolaAgua();
                break;
            case PLACAJE:
                instanciaMovimiento = new Placaje();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        instanciaMovimiento.utilizar(this, oponente);
    }

    @Override
    public Enum[] getMovimientos() {
        return Psyduck.Movimientos.values();
    }

}