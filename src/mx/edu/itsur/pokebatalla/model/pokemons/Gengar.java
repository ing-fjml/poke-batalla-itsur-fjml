package mx.edu.itsur.pokebatalla.model.pokemons;
import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.BolaSombra;

import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.RayoConfuso;
/**
 *
 * @author JORGE OSVIEL ALVAREZ MEDINA
 */

public class Gengar extends Pokemon {

    public enum Movimientos {
        BOLASOMBRA,
        ATAQUERAPIDO,
        RAYOCONFUSO,

        //Otros movimientos...
    }

    public Gengar() {
        this.tipo = "FANTASMA/VENENO";
        this.hp = 60;
        this.ataque = 65;
        this.defensa = 60;
        this.nivel = 1;
        this.precision = 5;

    }

    public void atacar(Pokemon oponente, Gengar.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case RAYOCONFUSO:
                instanciaMovimiento = new RayoConfuso();
                break;
            case ATAQUERAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case BOLASOMBRA:
                instanciaMovimiento = new BolaSombra();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento.
        instanciaMovimiento.utilizar(this, oponente);
    }

}