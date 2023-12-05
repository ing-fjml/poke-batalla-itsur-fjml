package mx.edu.itsur.pokebatalla.model.Pokemons;
import mx.edu.itsur.pokebatalla.moves.Movimiento;
import mx.edu.itsur.pokebatalla.moves.Impactrueno;
import mx.edu.itsur.pokebatalla.moves.Latigo;
import mx.edu.itsur.pokebatalla.moves.AtaqueRapido;
/**
@author Francisco gonzalez Regalado
 */
public class Pikachu  extends Pokemon
{
public enum Movimientos {
        IMPACTRUENO,
        //Otros movimientos...
    }

    //Constructor default
    public Pikachu() {
        this.tipo = "ELECTRICO";
        this.hp = 35;
        this.ataque = 55;
        this.defensa = 30;
        this.nivel = 1;
        this.precision = 4;
    }

    //Constructor alterno 1
    public Pikachu(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    @Override
    public Enum[] getMovimientos() {
        return Pikachu.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        Movimiento instanciaMovimiento;
        Pikachu.Movimientos movimientoAUtilizar = Pikachu.Movimientos.values()[ordinalMovimiento];
        if (this.hp <= 0) {
                System.out.println("Pikachu esta casado y no puede realizar mas movimientos.");
                return;
            }
        switch (movimientoAUtilizar) {
            case IMPACTRUENO:
                instanciaMovimiento = new Impactrueno();
                break;
            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento.
        instanciaMovimiento.utilizar(this, oponente);
    }

}
