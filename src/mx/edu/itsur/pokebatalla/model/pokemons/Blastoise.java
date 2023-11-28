/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Ataquefuria;
import mx.edu.itsur.pokebatalla.model.moves.Hidrobomba;
import mx.edu.itsur.pokebatalla.model.moves.Cabezazo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Brayan Eduardo González Parra-
 */
public class Blastoise extends Pokemon {

    public enum Movimientos {
        HIDROBOMBA,
        ATAQUEFURIA,
        CABEZAZO

    }

    public Blastoise() {
        this.tipo = "AGUA";
        this.hp = 79;
        this.ataque = 83;
        this.defensa = 100;
        this.nivel = 1;
        this.precision = 3;

    }

    public Blastoise(String nombre) {
        this();
        this.nombre = nombre;
    }

    protected void atacar(Pokemon oponente, Movimiento move) {
        move.utilizar(this, oponente);
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        if (this.hp <= 0) {
            System.out.println("Blastoise está agotado y no puede realizar más movimientos.");
            return;
        }

        Movimiento instanciaMovimiento;
        Blastoise.Movimientos movimientoAUtilizar = Blastoise.Movimientos.values()[ordinalMovimiento];
        switch (movimientoAUtilizar) {
            case HIDROBOMBA:
                instanciaMovimiento = new Hidrobomba();
                break;
            case ATAQUEFURIA:
                instanciaMovimiento = new Ataquefuria();
                break;
            case CABEZAZO:
                instanciaMovimiento = new Cabezazo();
                break;

            default:
                throw new AssertionError();
        }

        atacar(oponente, instanciaMovimiento);
    }

    @Override
    public Enum[] getMovimientos() {
        return Blastoise.Movimientos.values();

    }

}
