/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Francisco Gonzalez Regalado
 */
public class Sustituto extends MovimientoEstado{
        public Sustituto() {
        this.tipo = TiposDeMovimiento.NORMAL;
        this.potencia = 0;
        this.precision = 100;
        this.puntosPoder = 10;        
    } 
}
