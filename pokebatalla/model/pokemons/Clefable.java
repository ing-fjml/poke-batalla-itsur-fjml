package pokebatalla.model.pokemons;

import java.io.Serializable;
import pokebatalla.Movimientos.Psiquico;
import pokebatalla.Movimientos.Destello;
import pokebatalla.Movimientos.MegaPuño;
import pokebatalla.Movimientos.Movimiento;

/**
 *
 * @author Hannia Dinora González Magaña
 */
public class Clefable extends Pokemon implements  Serializable{

    public enum Movimientos {
        PSIQUICO,
        DESTELLO,
        MEGAPUÑO
    }

    public Clefable() {
        tipo = "HADA";
        hp = 95;
        ataque = 70;
        defensa = 73;
        nivel = 1;
        precision = 4;
    }

    public Clefable(String nombre) {
        this(); 
        this.nombre = nombre;
    }

    @Override
    public Enum[] getMovimientos() {
        return Bullbasaur.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println("Clefable esta agotado y no puede realizar mas movimientos.");
            return;
        }

        Clefable.Movimientos movimientoAUtilizar = Clefable.Movimientos.values()[ordinalMovimiento];
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
            default:
                throw new AssertionError();

        }

        instanciaMovimiento.utilizar(this, oponente);
      
    }
}
