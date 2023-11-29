package pokebatalla.model.pokemons;

import java.io.Serializable;
import pokebatalla.Movimientos.AtaqueRapido;
import pokebatalla.Movimientos.Latigo;
import pokebatalla.Movimientos.Movimiento;

/**
 *
 *@author Hannia Dinora Gonzalez Magaña
 */
public class Bullbasaur extends Pokemon  implements Serializable{

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

    public Bullbasaur(String nombre) {
        this(); 
        this.nombre = nombre;
    }

    @Override
    public Enum[] getMovimientos() {
        return Bullbasaur.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        Movimiento instanciaMovimiento;

        if (this.hp <= 0) {
            System.out.println("Bullbasaur. esta agotado y no puede realizar mas movimientos.");
            return;
        }
        
        Bullbasaur.Movimientos movimientoAUtilizar = Bullbasaur.Movimientos.values()[ordinalMovimiento];
        
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
