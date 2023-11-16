/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.BolaSombra;
import mx.edu.itsur.pokebatalla.model.moves.GolpeKarate;
import mx.edu.itsur.pokebatalla.model.moves.Latigo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.Placaje;
import mx.edu.itsur.pokebatalla.model.moves.RayoConfuso;

/**
 *
 * @author JORGE OSVIEL ALVAREZ MEDINA 
 */
public class Gengar extends Pokemon {

    public enum Movimientos {
        BOLA_SOMBRA,
        ATAQUE_RAPIDO,
        RAYO_CONFUSO,
        GOLPE_KARATE

        //Otros movimientos...
    }

    public Gengar() {
        this.tipo = "FANTASMA/VENENO";
        this.hp = 60;
        this.ataque = 65;
        this.defensa = 60;
        this.nivel = 1;
        this.precision = 5;
        this.xp = 190;

    }

    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        
        if (this.hp <= 0) {
            System.out.println("El Pokemon esta agotado y no puede realizar mas movimientos");
            return;
        }

        Gengar.Movimientos movimientoAUtilizar = Gengar.Movimientos.values()[ordinalMovimiento];
        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        
        switch (movimientoAUtilizar) {
            case RAYO_CONFUSO:
                instanciaMovimiento = new RayoConfuso();
                break;
            case BOLA_SOMBRA:
                instanciaMovimiento = new BolaSombra();
                break;
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }
        //Aplicar el movimiento.
        instanciaMovimiento.utilizar(this, oponente);
    }

    @Override
    public Enum[] getMovimientos() {
        return Gengar.Movimientos.values();
    }
}
