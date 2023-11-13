/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Francisco Gonzalez Regalado
 */
public class Viento_Cortante extends MovimientoEspecial{
    public Viento_Cortante() {
    this.tipo=TiposDeMovimiento.VOLADOR;
        this.potencia = 90;
        this.precision = 100;
        this.puntosPoder = 10;
}
}
