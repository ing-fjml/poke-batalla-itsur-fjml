package mx.edu.itsur.pokebatalla.model.Pokemons;

import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.moves.AtaqueArena;
import mx.edu.itsur.pokebatalla.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.moves.Avalancha;
import mx.edu.itsur.pokebatalla.moves.BesoAmoroso;
import mx.edu.itsur.pokebatalla.moves.BombaHuevo;
import mx.edu.itsur.pokebatalla.moves.BombaSonica;
import mx.edu.itsur.pokebatalla.moves.Movimiento;

/**
 @author Francisco gonzalez Regalado
 * 
 */

public class Aerodactyl extends Pokemon {
    public enum Movimientos {
    ATAQUEARENA,
    ATAQUERAPIDO,
    AVALANCHA
    }
    public  Aerodactyl()
    {
                this.tipo = ("ROCA");
                this.ataque = 105;
                this.defensa = 65;
                this.hp = 80;
                this.nivel = 1;
                this.precision = 2;
    }
    
   public Aerodactyl(String nombre)
   {
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
        Aerodactyl.Movimientos movimientoAUtilizar = Aerodactyl.Movimientos.values()[ordinalMovimiento];  
        switch (movimientoAUtilizar) {
            case ATAQUEARENA:
                instanciaMovimiento = new AtaqueArena();
                break;
            case ATAQUERAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case AVALANCHA:
                instanciaMovimiento = new Avalancha();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }
    instanciaMovimiento.utilizar(this, oponente);
   }
}
