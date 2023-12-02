/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Brayan Eduardo González Parra
 */
public class Picotazoveneno extends MovimientoFisico {

    public Picotazoveneno() {
        this.tipo = Movimiento.TiposDeMovimiento.VENENO;
        this.potencia = 15;
        this.precision = 100;
        this.puntosPoder = 35;

    }
}
