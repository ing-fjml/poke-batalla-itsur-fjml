package mx.edu.itsur.pokebatalla.model.Pokemons;
import mx.edu.itsur.pokebatalla.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.moves.Movimiento;

/**
@author Francisco gonzalez Regalado
 */
public class Bullbasaur extends Pokemon {

    public enum Movimientos {
    ATAQUERAPIDO
    }
    public Bullbasaur() {
        tipo = "PLANTA/VENENO";
        hp = 45;
        ataque = 49;
        defensa = 49;
        nivel = 1;
        precision = 4;
    }
    public Bullbasaur(String nombre){
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
        Bullbasaur.Movimientos movimientoAUtilizar =  Bullbasaur.Movimientos.values()[ordinalMovimiento];  
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
