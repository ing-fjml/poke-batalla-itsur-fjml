/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokebatalla;

import java.util.List;

/**
 *
 * @author FJML1983
 */
public class Pokemon {

    //Atributos
    int nivel;
    int hp;
    int ataque;
    int defensa;
    double precision;
    String tipo;
    List<String> habilidades;

    Pokemon() {
    }

    //Métodos
    void atacar(Pokemon enemigo) {
        System.out.println("Pokemon Atacando a un: " + enemigo.getClass().getName());
        //TODO: Aqui va la logica para causar daño al enemigo.

    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{tipo:" + tipo + " hp:" + hp + "}";
    }

}
