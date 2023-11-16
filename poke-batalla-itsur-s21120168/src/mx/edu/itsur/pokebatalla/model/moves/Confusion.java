/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author JORGE OSVIEL ALVAREZ MEDINA
 */
public class Confusion extends MovimientoEspecial {

    public Confusion() {
        this.tipo = Movimiento.TiposDeMovimiento.PSIQUICO;
        this.potencia = 50;
        this.precision = 100;
        this.puntosPoder = 25;

    }
}
