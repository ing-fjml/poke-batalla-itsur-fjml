/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.battles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

/**
 *
 * @author fatima gutierrez moreno
 */
public class Batalla {
    //Atributos
    protected Entrenador entrenador1;
    protected Entrenador entrenador2;
    protected int turno = 1;
    protected boolean batallaFinalizada = false;

    //Constructor
    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }    
    
    //Metodos
    public void desarrollarBatalla(){
        
        System.out.println(" ---------- La gran batalla de pokemones dara inicio------------");
        System.out.println("Jugadores: ");
        System.out.println(entrenador1.getNombre() + " <---Y---> " + entrenador2.getNombre());

        System.out.println(" ");

        eligirPokemon(entrenador1);
        eligirPokemon(entrenador2);

        while (!batallaFinalizada) {
            Entrenador entrenadorEnTurno = (turno == 1) ? entrenador1 : entrenador2;
            Entrenador oponente = (turno == 1) ? entrenador2 : entrenador1;

            System.out.println("Entrenador: " + entrenadorEnTurno.getNombre());

            if (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().getHp() <= 0) {
                cambiarPokemon(entrenadorEnTurno);
            }
            if (oponente.getPokemonActual() == null) {
                System.out.println("No hay pokemon seleccionado");
                return;
            }

            seleccionarAtaque(entrenadorEnTurno, oponente.getPokemonActual());

            Pokemon pokemonEnTurno = entrenadorEnTurno.getPokemonActual();

            if (oponente.estaDerrotado()) {
                System.out.println("¡Has sido el pokemon mas desafortunado " + oponente.getNombre() + " Has perdido la batalla!");
                batallaFinalizada = true;
            } else {
                turno = (turno == 1) ? 2 : 1;
            }
        }
    }

    private void eligirPokemon(Entrenador entrenadorEnturno) {
        int idx = 1;
        System.out.println("--------------------");
        for (Pokemon pokemon : entrenadorEnturno.getPokemonsCapturados()) {
            System.out.println(idx + ".- " + pokemon.getClass().getSimpleName());
            idx++;
             System.out.println("---------------------------");
        }
        System.out.println("");
        System.out.println("Escoje  un  pokemon " + entrenadorEnturno.getNombre());

        char auxLectura = '0';

        try {
            auxLectura = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Pokemon pokemonSeleccionado = entrenadorEnturno.getPokemonsCapturados()
                .get(Character.getNumericValue(auxLectura) - 1);
        entrenadorEnturno.setPokemonActual(pokemonSeleccionado);
    }

    private void seleccionarAtaque(Entrenador entrenadorEnturno, Pokemon oponente) {

        Pokemon pokemonActual = entrenadorEnturno.getPokemonActual();

        System.out.println("-----------------------------------------------------");
        System.out.println("Selecciona un ataque   " + pokemonActual.getClass().getSimpleName() + ":");

        int idx = 1;

        for (Enum movimiento : pokemonActual.getMovimientos()) {
            System.out.println(idx + ".- " + movimiento);
            idx++;
        }
        System.out.println("-----------------------------------------------------");

        int opcionAtaque = -1;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            opcionAtaque = Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException ex) {
            System.out.println("Opcion incorrecta");
            return;
        }

        if (opcionAtaque < 1 || opcionAtaque > pokemonActual.getMovimientos().length) {
            System.out.println("opcion correcta.");
            return;
        }

        
        entrenadorEnturno.instruirMovimientoAlPokemonActual(oponente, opcionAtaque - 1);
    }

   
    private void cambiarPokemon(Entrenador entrenador) {
        System.out.println("¿QUIERES EJEGIR OTRO POKEMON? (S/N)");

        char respuesta = 'N';

        try {
            respuesta = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        if (respuesta == 'S' || respuesta == 's') {

            System.out.println("Se encontro una actualizacion de los  pokemones disponibles:");
            int idx = 1;
            for (Pokemon pokemon : entrenador.getPokemonsCapturados()) {
                System.out.println(idx + ".- " + pokemon.getClass().getSimpleName());
                idx++;
            }

            
            System.out.println("Elige un nuevo Pokémon:");

            char auxLectura = '0';

            try {
                auxLectura = (char) System.in.read();
                System.in.read((new byte[System.in.available()]));
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            Pokemon nuevoPokemon = entrenador.getPokemonsCapturados().get(Character.getNumericValue(auxLectura) - 1);
            entrenador.setPokemonActual(nuevoPokemon);

            System.out.println("Elegiste por otro a tu pokemon " + nuevoPokemon.getClass().getSimpleName() + " en tu equipo.");
        }
        if(respuesta=='N' || respuesta=='N'){
            System.out.println("Fin");
            System.exit(0);
        }
    }
      
    }

