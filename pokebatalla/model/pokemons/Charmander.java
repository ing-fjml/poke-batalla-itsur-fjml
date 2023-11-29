
package pokebatalla.model.pokemons;

import java.io.Serializable;
import pokebatalla.Movimientos.AtaqueRapido;
import pokebatalla.Movimientos.Movimiento;

/**
 *
 * @author FJML1983
 */
public class Charmander extends Pokemon  implements Serializable {

    public enum Movimientos {
        ATAQUE_RAPIDO,
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

    //METODOS 
    @Override
    public Enum[] getMovimientos() {
        return Charmander.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println("Charmander. esta agotado y no puede realizar mas movimientos.");
            return;
        }

        Charmander.Movimientos movimientoAUtilizar = Charmander.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
        case ATAQUE_RAPIDO:
        instanciaMovimiento = new AtaqueRapido();
        break;
        default:
        throw new AssertionError();
        }
        //Aplicar el movimiento
        instanciaMovimiento.utilizar(this, oponente);

    }
}