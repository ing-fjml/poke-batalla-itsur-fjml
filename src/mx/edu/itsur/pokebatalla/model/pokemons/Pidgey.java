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

     @Override
    public Enum[] getMovimientos() {
        return Pidgey.Movimientos.values();
    }    
    
    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        //Si el pokemon está agotado no podrá realizar nada.
        if (this.hp <= 0) {
            System.out.println("Pidgey esta agotado y no puede realizar mas movimientos.");
            return;
        }        
        
        //Obtener el movimiento de acuerdo a su numero ordinal
        Pidgey.Movimientos movimientoAUtilizar = 
                Pidgey.Movimientos.values()[ordinalMovimiento];
        
        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case  VIENTO_CORTANTE:
                instanciaMovimiento = new Viento_Cortante();
                break;
            case SUSTITUTO:
                instanciaMovimiento = new Sustituto();
                break;
            //Otros movimientos aquí...
            default:
                throw new AssertionError();
                
        }

        //Aplicar el movimiento
        instanciaMovimiento.utilizar(this, oponente);
        
    }
    
}
