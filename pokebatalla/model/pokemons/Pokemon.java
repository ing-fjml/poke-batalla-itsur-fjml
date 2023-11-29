/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla.model.pokemons;

import java.io.Serializable;

/**
 *
 *
 */
public abstract class Pokemon  implements Serializable {
    //Atributos

    protected String tipo;
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected double precision;

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
    public int gethp()
        {
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

    
    public abstract void atacar(Pokemon oponente, int ordinalMovimiento);

    public abstract Enum[] getMovimientos();

    @Override
    public String toString() {

        return this.getClass().getSimpleName()
                + "{tipo:" + tipo + " hp:" + hp + "}";
    }

}
