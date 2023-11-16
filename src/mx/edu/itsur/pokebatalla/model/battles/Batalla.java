/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.battles;

import mx.edu.itsur.pokebatalla.model.pokemons.Gengar;

/**
 *
 * @author JORGE OSVIEL  ALVAREZ MEDINA 
 */
public class Batalla {
    protected Entrenador entrenador1;
    protected Entrenador entrenador2;
    protected int turno = 1;
    protected boolean batallaFinalizada = false;

    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }

    public void desarrollarBatalla() {
        while (!batallaFinalizada) {
            // Obtener el entrenador en turno
            Entrenador entrenadorEnTurno = (turno == 1) ? entrenador1 : entrenador2;
            Entrenador oponente = (turno == 1) ? entrenador2 : entrenador1;

 
            if (entrenadorEnTurno.getPokemonActual() == null) {
                System.out.println(entrenadorEnTurno.getNombre() + ", elige tu Pokémon:");
                
            }

           
            System.out.println(entrenadorEnTurno.getNombre() + ", selecciona tu movimiento:");
           

            // Realizar el movimiento OJO AQUI "ordinalMovimiento no funciona como deberia funcionar"
           entrenadorEnTurno.instruirMovimientoAlPokemonActual(oponente.getPokemonActual(), Gengar.Movimientos.BOLA_SOMBRA.ordinal());


            // Revisar si el oponente está derrotado y terminó la batalla
            if (oponente.estaDerrotado()) {
                System.out.println(entrenadorEnTurno.getNombre() + " ha ganado la batalla!");
                batallaFinalizada = true;
            }

            // Si nadie ha ganado aún, se cambia el turno y repite
            turno = (turno == 1) ? 2 : 1;
        }
    }
}


