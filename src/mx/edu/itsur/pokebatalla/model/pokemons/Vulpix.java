package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Ataque_rapido;
import mx.edu.itsur.pokebatalla.model.moves.ascuas;
import mx.edu.itsur.pokebatalla.model.moves.Malisioso;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import java.util.ArrayList;


/**
 *
 * @author Francisco Gonzalez Regalado
 */
public class Vulpix extends Pokemon{
    
    public enum Movimientos {
       ATAQUE_RAPIDO,
       ASCUAS,
        MALISIOSO
        
    }
    public Vulpix () {
        tipo = "FUEGO";
        hp = 90;
        ataque = 96;
        defensa = 106;
        nivel = 1;
        precision = 4;
    }
    
        public Vulpix (String nombre){
        this();
        this.nombre = nombre;
    }
    
 @Override
    public Enum[] getMovimientos() {
        return Vulpix.Movimientos.values();
    }    
    
    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        //Si el pokemon está agotado no podrá realizar nada.
        if (this.hp <= 0) {
            System.out.println("Vulpix esta agotado y no puede realizar mas movimientos.");
            return;
        }        
        
        //Obtener el movimiento de acuerdo a su numero ordinal
        Vulpix.Movimientos movimientoAUtilizar = 
                Vulpix.Movimientos.values()[ordinalMovimiento];
        
        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case MALISIOSO:
                instanciaMovimiento = new Malisioso();
                break;
            //Otros movimientos aquí...
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento
        instanciaMovimiento.utilizar(this, oponente);
        
    }
    
}
