package pokebatalla.pokemons;

import pokebatalla.Movimientos.Placaje;
import pokebatalla.Movimientos.Burbuja;
import pokebatalla.Movimientos.Refugio;
import pokebatalla.Movimientos.Movimiento;

/**
 *
 * @author Hannia Dinora González Magaña
 */
public class Squirtle extends Pokemon {
    

    public enum Movimientos {
       PLECAJE,
       BURBUJA,
       REFUGIO
}
    public Squirtle(){
        tipo = "AGUA";
        hp =44 ;
        ataque = 48;
        defensa = 65;
        nivel = 1;
        precision = 4;
       
    }    
    
    //Constructor alterno 1
    public Squirtle(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
        @Override
    public Enum[] getMovimientos() {
        return Bullbasaur.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println("Squirtle se agoto y no puede realizar mas movimientos.");
            return;
        }
        
       Squirtle.Movimientos movimientoAUtilizar = Squirtle.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
         switch (movimientoAUtilizar) {
            case BURBUJA:
                instanciaMovimiento = new Burbuja();
                break;
                case PLECAJE:
                    instanciaMovimiento = new Placaje();
                    break;
                case REFUGIO:
                    instanciaMovimiento = new Refugio();
                            break;
            default:
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }
}


