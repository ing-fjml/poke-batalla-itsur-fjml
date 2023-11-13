/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Francisco Gonzalez Regalado
 */
public class OndaTrueno extends MovimientoEstado{
    public OndaTrueno() {
        this.tipo=TiposDeMovimiento.ELECTRICO;
        this.potencia = 0;
        this.precision = 90;
        this.puntosPoder = 120;    
    }      
}
