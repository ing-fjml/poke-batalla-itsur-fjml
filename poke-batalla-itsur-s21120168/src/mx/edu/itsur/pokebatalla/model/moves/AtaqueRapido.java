/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author JORGE OSVIEL ALVAREZ MEDINA
 */
public class AtaqueRapido extends MovimientoFisico {

    public AtaqueRapido() {
        this.tipo = TiposDeMovimiento.NORMAL;
        this.potencia = 40;
        this.precision = 100;
        this.puntosPoder = 30;
    }

}
