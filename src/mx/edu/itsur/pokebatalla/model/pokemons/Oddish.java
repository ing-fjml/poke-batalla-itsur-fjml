/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;


import mx.edu.itsur.pokebatalla.model.moves.Danza_Petalo;
import mx.edu.itsur.pokebatalla.model.moves.Espora;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.Picotazo_Veneno;




/**
 *
 * @Fatima Gutierrez Moreno
 */
public class Oddish extends Pokemon{
  
    public enum Movimientos {
        Danza_Petalo,
        Espora,
        Picotazo_Veneno,
        
    }

    
    
    
    public Oddish() {
        this.tipo = "PLANTA/VENENO";
        this.hp = 45;
        this.ataque = 50;
        this.defensa = 55;
        this.nivel = 1;
        this.precision = 4;
        
        
    }    
    
   
    public Oddish(String nombre){
        this();
        this.nombre = nombre;
    }
    
  
    public void atacar(Pokemon oponente, Oddish.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;        
        switch (movimientoAUtilizar) {
            case Danza_Petalo:
                instanciaMovimiento = new Danza_Petalo();
                break;
            case Espora:
                instanciaMovimiento = new Espora();
                break;
            case Picotazo_Veneno:
                instanciaMovimiento = new Picotazo_Veneno();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento.
        instanciaMovimiento.utilizar(this, oponente);
    }
    
}
