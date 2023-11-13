/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Francisco Gonzalez Regalado
 */
public class Trueno extends MovimientoEspecial{
    public Trueno() {
        this.tipo=TiposDeMovimiento.ELECTRICO;
        this.potencia = 110;
        this.precision = 70;
        this.puntosPoder = 10;    
    }  
}
