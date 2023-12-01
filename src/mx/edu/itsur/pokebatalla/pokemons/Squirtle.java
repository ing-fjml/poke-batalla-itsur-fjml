/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemons;


//import java.io.Serializable;
import moves.Burbuja;
import moves.Cascada;
import moves.Movimiento;
import moves.Refugio;




/**
 *
 * @author Fatima Gutierrez Moreno
 */
public class Squirtle extends Pokemon  {
   
    public enum Movimientos {
       Burbuja,
       Cascada,
       Refugio,
       
    }

    
    
    public Squirtle() {
        this.tipo = "AGUA";
        this.hp = 44;
        this.ataque = 48;
        this.defensa = 65;
        this.nivel = 1;
        this.precision = 4;
       
        
    }    
    
   
    public Squirtle(String nombre){
        this();
        this.nombre = nombre;
    }
    
      
     @Override
    public Enum[] getMovimientos() {
        return Squirtle.Movimientos.values();
    }

    @Override
    public  void atacar(Pokemon oponente, int ordinalMovimiento) {

        //Si el pokemon está agotado no podrá realizar nada.
        if (this.hp <= 0) {
            System.out.println("Squirtle esta agotado y no puede realizar mas movimientos.");
            return;
        }

        //Obtener el movimiento de acuerdo a su numero ordinal
        Squirtle.Movimientos movimientoAUtilizar
                = Squirtle.Movimientos.values()[ordinalMovimiento];

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case Burbuja:
                instanciaMovimiento = new Burbuja();
                break;
            case Cascada:
                instanciaMovimiento = new Cascada();
                break;
            case Refugio:
                instanciaMovimiento = new Refugio();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento.
        instanciaMovimiento.utilizar(this, oponente);
    }
    
}
