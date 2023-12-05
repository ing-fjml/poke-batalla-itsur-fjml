package mx.edu.itsur.pokebatalla.model.Pokemons;
import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.moves.BesoAmoroso;
import mx.edu.itsur.pokebatalla.moves.BombaHuevo;
import mx.edu.itsur.pokebatalla.moves.BombaSonica;
import mx.edu.itsur.pokebatalla.moves.Movimiento;
/**
 Sra. Evelyn
 * s22120162
 */
public  class Evee extends Pokemon{
   public enum Movimientos {
      BESOAMOROSO,
      BOMBAHUEVO,
      BOMBASONICA
    }
    public Evee()
            {
                this.tipo = "NORMAL";
                this.ataque = 55;
                this.defensa = 50;
                this.hp = 55;
                this.nivel = 1;
                this.precision = 4;
               // this.habilidades  = new ArrayList<>();
                //this.habilidades.add("RAPIDEZ");
                //this.habilidades.add("METRONOMO");
            }
    public Evee(String nombre)
    {
        this();
        this.nombre = nombre;
    }
    @Override
    public Enum[]getMovimientos()
    {
       return Evee.Movimientos.values();
    }
    @Override
     public void atacar(Pokemon oponente, int ordinalMovimiento) {
           
  
        Movimiento instanciaMovimiento;       
        Evee.Movimientos movimientoAUtilizar=Evee.Movimientos.values()[ordinalMovimiento];
        if(this.hp<=0)
        {
            System.out.println("EVEE SE ESTA DEAD");
            return;
        }
        switch (movimientoAUtilizar) {
            case BESOAMOROSO:
                instanciaMovimiento = new BesoAmoroso();
                break;
            case BOMBAHUEVO:
                instanciaMovimiento = new BombaHuevo();
                break;
            case BOMBASONICA:
                instanciaMovimiento = new BombaSonica();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
     }
}
