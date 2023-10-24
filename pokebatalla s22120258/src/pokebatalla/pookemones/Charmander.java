
package pokebatalla.pookemones;

import pokebatalla.Movimientos.AtaqueRapido;
import pokebatalla.Movimientos.Movimiento;

/**
 *
 * @author FJML1983
 */
public class Charmander extends Pokemon {

    /**
     * Movimientos que puede realizar el Pokémon
     */
    public enum Movimientos {
        ATAQUE_RAPIDO,

        //Otros movimientos...
    }

    public Charmander() {
        tipo = "FUEGO";
        hp = 39;
        ataque = 52;
        defensa = 43;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Charmander(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    public void atacar(Pokemon oponente, Charmander.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
        case ATAQUE_RAPIDO:
        instanciaMovimiento = new AtaqueRapido();
        break;

        //Otros movimientos aquí...
        default:
        throw new AssertionError();
        }

        //Aplicar el movimiento
        instanciaMovimiento.utilizar(this, oponente);

    }
}