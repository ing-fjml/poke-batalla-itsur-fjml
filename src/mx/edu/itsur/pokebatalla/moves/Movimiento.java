/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moves;

import pokemons.Pokemon;

/**
 * Esta clase representa nn movimiento o ataque 
 * (Move en inglés; わざ Movimiento en japonés) 
 * es una técnica que los Pokémon son capaces de aprender 
 * y que usan en los combates con el fin de debilitar a sus oponentes.
 * https://www.wikidex.net/wiki/Movimiento
 * 
 * @author Fatima Gutierrez Moreno
 */
public abstract class Movimiento {

    enum TiposDeMovimiento {
        //Primera Generación
        AGUA,
        BICHO,
        DRAGON,
        ELECTRICO,
        FANTASMA,
        FUEGO,
        HIELO,
        LUCHA,
        NORMAL,
        PLANTA,
        PSIQUICO,
        ROCA,
        SINIESTRO,
        TIERRA,
        VENENO,
        VOLADOR
        //Segunda Generación
        //...        
    }

    //Atributos
    protected TiposDeMovimiento tipo;
    protected int potencia;
    protected int precision;
    protected int puntosPoder;

    //Métodos
    public abstract void utilizar(Pokemon usuario, Pokemon objetivo);
}