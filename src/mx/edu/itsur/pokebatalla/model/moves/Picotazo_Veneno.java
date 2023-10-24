/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author fatima gutierrez moreno
 */
public class Picotazo_Veneno extends MovimientoFisico {
    
    public Picotazo_Veneno () {
        this.tipo = Movimiento.TiposDeMovimiento.VENENO;
        this.potencia = 15;
        this.precision = 100;
        this.puntosPoder = 35;        
    }
}
