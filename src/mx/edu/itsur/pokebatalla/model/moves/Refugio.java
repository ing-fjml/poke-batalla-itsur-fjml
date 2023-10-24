/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author fatima gutierrez moreno
 */
public class Refugio extends MovimientoEstado{
    
    public  Refugio() {
        this.tipo = Movimiento.TiposDeMovimiento.AGUA;
        this.potencia = 30;
        this.precision = 30;
        this.puntosPoder = 40;        
    }
}
