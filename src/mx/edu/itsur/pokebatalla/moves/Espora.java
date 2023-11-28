/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moves;

/**
 *
 * @author fatima gutierrez moreno
 */
public class Espora extends MovimientoEstado {
    
    public  Espora() {
        this.tipo = Movimiento.TiposDeMovimiento.PLANTA;
        this.potencia = 30;
        this.precision = 100;
        this.puntosPoder = 15;        
    }
}
