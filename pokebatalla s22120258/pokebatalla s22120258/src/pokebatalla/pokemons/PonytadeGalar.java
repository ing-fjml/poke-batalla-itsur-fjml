/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.pokemons;

import pokebatalla.Movimientos.Confusion;
import pokebatalla.Movimientos.Gruñido;
import pokebatalla.Movimientos.Pisoton;
import pokebatalla.Movimientos.Movimiento;

/**
 *
 *
 * @author Hannia Dinora González Magaña
 */
public class PonytadeGalar extends Pokemon {
    public enum Movimientos {
       CONFUSION,
       GRUÑIDO,
       PISOTON
    }
    public PonytadeGalar(){
        tipo = "PSIQUICO";
        hp =50 ;
        ataque = 85;
        defensa = 55;
        nivel = 1;
        precision = 4;
        
        //....
    }    
    
    //Constructor alterno 1 confusion gruñigo pisoton
    public PonytadeGalar(String nombre){
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
            System.out.println("Ponyta de Glalar esta agotado y no puede realizar mas movimientos");
            return;
        }
        
       PonytadeGalar.Movimientos movimientoAUtilizar = PonytadeGalar.Movimientos.values()[ordinalMovimiento];
       Movimiento instanciaMovimiento;
       
        switch (movimientoAUtilizar) {
            case CONFUSION:
               instanciaMovimiento = new Confusion();
                break;
                case GRUÑIDO:
                            instanciaMovimiento = new Gruñido();
               case PISOTON:
                   instanciaMovimiento = new Pisoton();
                break;
            default:
                throw new AssertionError();
        }
       instanciaMovimiento.utilizar(this, oponente);
    }
}

    

