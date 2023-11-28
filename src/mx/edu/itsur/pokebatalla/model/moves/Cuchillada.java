/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Brayan Eduardo González Parra-
 */
public class Cuchillada extends MovimientoEstado {

    public Cuchillada() {
        this.tipo = Movimiento.TiposDeMovimiento.NORMAL;
        this.potencia = 70;
        this.precision = 100;
        this.puntosPoder = 20;

    }
}
