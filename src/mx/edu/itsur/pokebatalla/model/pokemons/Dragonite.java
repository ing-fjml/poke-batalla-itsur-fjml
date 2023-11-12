/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;


import mx.edu.itsur.pokebatalla.model.moves.Ataque_Ala;
import mx.edu.itsur.pokebatalla.model.moves.Espejo;
import mx.edu.itsur.pokebatalla.model.moves.Furia_Dragon;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;



/**
 *
 * @author Fatima Gutierrez Moreno
 */
public class Dragonite extends Pokemon {
     
    public enum Movimientos {
        Furia_Dragon,
        Ataque_Ala,
        Espejo,
    }
    
    

    
     public Dragonite() {
        this.tipo = "DRAGÓN/VOLADOR";
        this.hp = 91;
        this.ataque = 134;
        this.defensa = 95;
        this.nivel = 1;
        this.precision = 3;
        
        
    }    
    
    
    public Dragonite(String nombre){
        this(); 
        this.nombre = nombre;
    }
    
    @Override
    public Enum[] getMovimientos() {
        return Dragonite.Movimientos.values();
    } 
    
    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        //Si el pokemon está agotado no podrá realizar nada.
        if (this.hp <= 0) {
            System.out.println("Dragonite esta agotado y no puede realizar mas movimientos.");
            return;
        }

        //Obtener el movimiento de acuerdo a su numero ordinal
        Dragonite.Movimientos movimientoAUtilizar
                = Dragonite.Movimientos.values()[ordinalMovimiento];

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case Furia_Dragon:
                instanciaMovimiento = new Furia_Dragon();
                break;
            case Ataque_Ala:
                instanciaMovimiento = new Ataque_Ala();
                break;
            case Espejo:
                instanciaMovimiento = new Espejo();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento.
        instanciaMovimiento.utilizar(this, oponente);
    }

    
    
}
