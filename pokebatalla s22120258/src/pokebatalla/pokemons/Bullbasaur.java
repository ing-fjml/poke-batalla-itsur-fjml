package pokebatalla.pokemons;

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
