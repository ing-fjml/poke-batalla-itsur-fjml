/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moves;

/**
 *
 * @author Fatima Gutierrez Mreno
 */
public class Espejo extends MovimientoEstado{
    
    public  Espejo() {
        this.tipo = Movimiento.TiposDeMovimiento.VOLADOR;
        this.potencia = 30;
        this.precision = 30;
        this.puntosPoder = 20;        
    }
}
