package mx.edu.itsur.pokebatalla.model.pokemons;

import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.model.moves.GolpeKarate;
import mx.edu.itsur.pokebatalla.model.moves.Malicioso;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.Proteccion;

/**
 *
 * @author JORGE OSVIEL ALVAREZ MEDINA
 */
public class Snorlax extends Pokemon {

    public enum Movimientos {
        MALICIOSO,
        GOLPEKARATE,
        PROTECCION,

        //Otros movimientos...
    }

    public Snorlax() {
        this.tipo = "NORMAL";
        this.hp = 160;
        this.ataque = 110;
        this.defensa = 65;
        this.nivel = 1;
        this.precision = 3;

    }

    public void atacar(Pokemon oponente, Snorlax.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case MALICIOSO:
                instanciaMovimiento = new Malicioso();
                break;
            case GOLPEKARATE:
                instanciaMovimiento = new GolpeKarate();
                break;
            case PROTECCION:
                instanciaMovimiento = new Proteccion();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento.
        instanciaMovimiento.utilizar(this, oponente);
    }

}
