/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Francisco Gonzalez regalado
 */
public class AtaqueAereo extends MovimientoFisico{
    public AtaqueAereo() {
        this.tipo=TiposDeMovimiento.VOLADOR;
        this.potencia = 140;
        this.precision = 90;
        this.puntosPoder = 5;
    }
}
