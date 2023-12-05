package mx.edu.itsur.pokebatalla.model.Pokemons;

import java.io.Serializable;
import java.util.List;
import mx.edu.itsur.pokebatalla.moves.Movimiento;

/**
 * @author Francisco gonzalez Regalado
 */
public abstract class Pokemon implements Serializable{

    protected String tipo;
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected double precision;
    protected List<Movimiento> movimientos;

    Pokemon() {
    }

    //Getters
    public int getNivel() {
        return nivel;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }
     public int gethp() {
        return hp;
    }


    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Métodos 
    public void recibirDanio(int danio) {
        this.hp = this.hp - danio;
    }

    public abstract Enum[] getMovimientos();

    public abstract void atacar(Pokemon oponente, int ordinalMovimiento);

    @Override
    public String toString() {

        return this.getClass().getSimpleName()
                + "{tipo:" + tipo + " hp:" + hp + "}";
    }
}
