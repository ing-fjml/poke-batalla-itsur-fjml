/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Cuchillada;
import mx.edu.itsur.pokebatalla.model.moves.Arañazo;
import mx.edu.itsur.pokebatalla.model.moves.Lanzallamas;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Brayan Eduardo González Parra
 */
public class Charmeleon extends Pokemon {

    public enum Movimientos {
        LANZALLAMAS,
        CUCHILLADA,
        ARAÑAZO

    }

    public Charmeleon() {
        this.tipo = "FUEGO";
        this.hp = 58;
        this.ataque = 64;
        this.defensa = 58;
        this.nivel = 1;
        this.precision = 4;

    }

    public Charmeleon(String nombre) {
        this();
        this.nombre = nombre;
    }

    protected void atacar(Pokemon oponente, Movimiento move) {
        move.utilizar(this, oponente);
    }

    @Override
    public Enum[] getMovimientos() {
        return Charmeleon.Movimientos.values();

    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        if (this.hp <= 0) {
            System.out.println("Charmeleon está agotado y no puede realizar más movimientos.");
            return;
        }

        Movimiento instanciaMovimiento;
        Charmeleon.Movimientos movimientoAUtilizar = Charmeleon.Movimientos.values()[ordinalMovimiento];
        switch (movimientoAUtilizar) {
            case LANZALLAMAS:
                instanciaMovimiento = new Lanzallamas();
                break;
            case CUCHILLADA:
                instanciaMovimiento = new Cuchillada();
                break;
            case ARAÑAZO:
                instanciaMovimiento = new Arañazo();
                break;

            default:
                throw new AssertionError();
        }

        atacar(oponente, instanciaMovimiento);
    }

}
