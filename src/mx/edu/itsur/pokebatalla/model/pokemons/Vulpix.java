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
    
public void atacar(Pokemon oponente, Vulpix.Movimientos movimientoAUtilizar){
        Movimiento instanciaMovimiento;
        switch(movimientoAUtilizar) {
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new Ataque_rapido();
                break;
            case ASCUAS:
                instanciaMovimiento = new Ascuas();
                break;
            case MALISIOSO:
                instanciaMovimiento = new Malisioso();
                break;
            
            default:
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }
}
