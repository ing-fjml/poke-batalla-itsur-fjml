package mx.edu.itsur.pokebatalla.model.Pokemons;

import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.model.moves.AtaqueAereo;
import mx.edu.itsur.pokebatalla.model.moves.Viento_Cortante;
import mx.edu.itsur.pokebatalla.model.moves.Sustituto;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
/**
 *
 * @author Francisco Gonzalez Regalado
 */
public class Pidgey extends Pokemon{

    public enum Movimientos {
       VIENTO_CORTANTE,
        ATAQUE_AEREO,
        SUSTITUTO

    }

    public Pidgey () {
        tipo = "VOLADOR";
        hp = 40;
        ataque = 45;
        defensa = 40;
        nivel = 1;
        precision = 5;
    }

        public Pidgey (String nombre){
        this();
        this.nombre = nombre;
    }

    public void atacar(Pokemon oponente, Pidgey.Movimientos movimientoAUtilizar){
        Movimiento instanciaMovimiento;
        switch(movimientoAUtilizar) {
            case VIENTO_CORTANTE:
                instanciaMovimiento = new RayoHielo();
                break;
            case ATAQUE_AEREO:
                instanciaMovimiento = new AtaqueAereo();
                break;
            case SUSTITUTO:
                instanciaMovimiento = new Sustituto();
                break;

            default:
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }



}
