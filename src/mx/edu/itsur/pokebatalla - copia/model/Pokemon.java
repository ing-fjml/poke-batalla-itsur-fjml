/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import java.util.List;

/**
 *
 * @author FJML1983
 */
public class Pokemon {

    //Atributos
    protected String tipo;
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected double precision;
    protected List<String> habilidades;

    Pokemon() {
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Métodos
    public void atacar(Pokemon oponente) {
        
        System.out.println("Mi pokemon:" + this.nombre);
        System.out.println("esta atacando a: " + oponente);
        
        if (this.ataque > oponente.defensa) {
            //Calcular el daño
            int damage = this.ataque - oponente.defensa;
            //Restar el daño del HP del oponente
            oponente.hp = oponente.hp - damage;
            System.out.println("Y le causo un daño de: " + damage);
        }else{
           //TODO: ...Y si no que pasa?
        }
        System.out.println("El pokemon oponente quedo asi:" + oponente);

        
        
        //System.out.println("Pokemon Atacando a un: " + enemigo.getClass().getName());
        //TODO: Aqui va la logica para causar daño al enemigo.

    }

    @Override
    public String toString() {

        return this.getClass().getName() + 
                "{tipo:" + tipo + " hp:" + hp + "}";
    }

}
