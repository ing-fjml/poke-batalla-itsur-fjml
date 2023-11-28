/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moves;

/**
 *
 * @author Fatima Gutierrez Moreno
 */
public class Ataque_Ala extends MovimientoFisico{
    
    public  Ataque_Ala() {
        this.tipo = Movimiento.TiposDeMovimiento.VOLADOR;
        this.potencia = 60;
        this.precision = 100;
        this.puntosPoder = 35;        
    }
}
