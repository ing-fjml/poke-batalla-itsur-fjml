package mx.edu.itsur.pokebatalla.moves;
/**
@author Francisco gonzalez Regalado
 */
public class BombaHuevo extends MovimientoFisico{
    
    public BombaHuevo()
    {
        this.tipo = TiposDeMovimiento.NORMAL;
        this.precision = 75;
        this.potencia = 100;
        this.puntosPoder = 10;
    }
}
