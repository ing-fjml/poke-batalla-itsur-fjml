/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model.pokemons;


import mx.edu.itsur.pokebatalla.model.moves.Burbuja;
import mx.edu.itsur.pokebatalla.model.moves.Cascada;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.Refugio;




/**
 *
 * @author Fatima Gutierrez Moreno
 */
public class Squirtle extends Pokemon {
   
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
    
      
    public void atacar(Pokemon oponente, Squirtle.Movimientos movimientoAUtilizar) {

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
