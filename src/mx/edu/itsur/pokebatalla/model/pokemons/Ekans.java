/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Gruñido;
import mx.edu.itsur.pokebatalla.model.moves.Ácido;
import mx.edu.itsur.pokebatalla.model.moves.Picotazoveneno;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import java.io.Serializable;

/**
 *
 * @author Brayan Eduardo González Parra-
 */
public class Ekans extends Pokemon implements Serializable {

    public enum Movimientos {
        PICOTAZOVENENO,
        GRUÑIDO,
        ÁCIDO

    }

    public Ekans() {
        this.tipo = "VENENO";
        this.hp = 35;
        this.ataque = 60;
        this.defensa = 44;
        this.nivel = 1;
        this.precision = 3;

    }

    public Ekans(String nombre) {
        this();
        this.nombre = nombre;
    }

    protected void atacar(Pokemon oponente, Movimiento move) {
        move.utilizar(this, oponente);
    }

    @Override
    public Enum[] getMovimientos() {
        return Ekans.Movimientos.values();

    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        if (this.hp <= 0) {
            System.out.println("Ekans está agotado y no puede realizar más movimientos.");
            return;
        }

        Movimiento instanciaMovimiento;
        Ekans.Movimientos movimientoAUtilizar = Ekans.Movimientos.values()[ordinalMovimiento];
        switch (movimientoAUtilizar) {
            case PICOTAZOVENENO:
                instanciaMovimiento = new Picotazoveneno();
                break;
            case GRUÑIDO:
                instanciaMovimiento = new Gruñido();
                break;
            case ÁCIDO:
                instanciaMovimiento = new Ácido();
                break;

            default:
                throw new AssertionError();
        }

        atacar(oponente, instanciaMovimiento);
    }

}
