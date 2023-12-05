package mx.edu.itsur.pokebatalla.model.Pokemons;
import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.moves.Movimiento;
/**
 * @author Francisco gonzalez Regalado
 */
public class Charmander extends Pokemon {

    public Charmander() {

        this.tipo = "FUEGO";
        this.hp = 39;
        this.ataque = 52;
        this.defensa = 43;
        this.nivel = 1;
        this.precision = 4;
        //this.habilidades = new ArrayList<>();
        //this.habilidades.add("ARAÑAZO");
        //this.habilidades.add("GRUÑIDO");
    }
      public enum Movimientos {
      ATAQUERAPIDO
    }
    public Charmander(String nombre) {
        this();
        this.nombre = nombre;
    }
    
    @Override
    public Enum[] getMovimientos() {
        return Dratini.Movimientos.values();
    }
    
    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        Movimiento instanciaMovimiento;
        Charmander.Movimientos movimientoAUtilizar = Charmander.Movimientos.values()[ordinalMovimiento];
        if (this.hp <= 0) {
            System.out.println("CHARMANDER SE ESTA DEAD");
            return;
        }
        switch (movimientoAUtilizar) {
            case ATAQUERAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }
}
