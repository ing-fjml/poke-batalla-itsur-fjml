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
    protected Entrenador entrenador1;
    protected Entrenador entrenador2;
    protected int turno = 1;
    protected boolean batallaFinalizada = false;

    //Constructor
    public Batalla(Entrenador entrenador1 , Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }    
    
    public void desarrollarBatalla() {
        System.out.println("⊹⊹⊹⊹⊹⊹⊹⊹ LA BATALLA POR LA SUPERVIVENCIA DARA INICIO⊹⊹⊹⊹⊹⊹⊹ :) ");
        System.out.println("LOS CONTRINCANTES  SERAN LOS SIGUIENTES: ");
        System.out.println(entrenador1.getNombre() + "  V.S  " + entrenador2.getNombre());

        System.out.println("");

        do {
            try {
                eligeUnPokemon(entrenador1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("CUENTAS CON LOS SIGUIENTES POKEMONES:  " 
                        + entrenador1.getPokemonsCapturados().size() 
                        + " Elige alguno de ellos");
                entrenador1.setPokemonActual(null);
            }
        } while (entrenador1.getPokemonActual() == null);

        do {
            try {
                eligeUnPokemon(entrenador2);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("CUENTAS CON LOS SIGUIENTES POKEMONES:   " 
                        + entrenador2.getPokemonsCapturados().size() 
                        + "Elige alguno de ellos");
                entrenador2.setPokemonActual(null);
            }
        } while (entrenador2.getPokemonActual() == null);

        while (!batallaFinalizada) {
            Entrenador entrenadorEnTurno = (turno == 1) ? entrenador1 : entrenador2;
            Entrenador oponente = (turno == 1) ? entrenador2 : entrenador1;
             System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
            System.out.println("Ronda del entrenador: " + entrenadorEnTurno.getNombre());
            
            if (oponente.getPokemonActual() == null) {
                System.out.println("Por el momento no se encuentra ningun pokemon"
                        + " seleccionado  para contrincante");
                return;
            }
           
            seleccionaUnAtaque(entrenadorEnTurno, oponente.getPokemonActual());
            if (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().gethp() <= 0) {
                cambiarDePokemon(entrenadorEnTurno);
            }
            while (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().gethp() <= 0) {
                    System.out.println("!STOP¡ No des un paso más,"
                            + " deves cambiar tu pokemon actual por otro ya que debe descansar!!!");
                    cambiarDePokemon(entrenadorEnTurno);
                }

            if (oponente.estaDerrotado()) {
                System.out.println("El entrenador " + oponente.getNombre() + 
                        " lamentablemente fue  derrotado por este contrincante: " );
            System.out.println(" ⊹⊹⊹⊹⊹⊹⊹ A LLEGADO A SU FIN ESTA BATALLALA BATALLA⊹⊹⊹⊹⊹⊹⊹  ");
            batallaFinalizada = true;
            } else {
                
                turno = (turno == 1) ? 2 : 1;
            }
        }
    }

    private void eligeUnPokemon(Entrenador ent) {
        int idx = 1;
        System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
        for (Pokemon pokemon : ent.getPokemonsCapturados()) {
            System.out.println(idx + ".- " + pokemon.getClass().getSimpleName());
            idx++;
            System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡");

        }
        System.out.println("");
        System.out.println("Selecciona a un  pokemon que creas que es mejor " + ent.getNombre() + ":");
             System.out.println("♡♡♡♡♡♡♡");

        char auxLectura = '0';

        try {
            auxLectura = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
             System.out.println("♡♡♡♡♡♡♡♡♡");

        Pokemon pokemonSeleccionado = ent.getPokemonsCapturados()
                .get(Character.getNumericValue(auxLectura) - 1);
        ent.setPokemonActual(pokemonSeleccionado);
    }

    private void seleccionaUnAtaque(Entrenador ent, Pokemon oponente) {

        Pokemon pokemonActual = ent.getPokemonActual();

        System.out.println("♡♡♡♡♡♡♡♡♡");
        System.out.println("Seleccione el mejor ataque que sea mejor " + pokemonActual.getClass().getSimpleName() + ":");

        int idx = 1;

        for (Enum movimiento : pokemonActual.getMovimientos()) {
            System.out.println(idx + ".- " + movimiento);
            idx++;
        }
        System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");

        int escAtaque = -1;
        while (true) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            
            escAtaque = Integer.parseInt(input);
            if (escAtaque < 1 || escAtaque > pokemonActual.getMovimientos().length) {
                    System.out.println("Este ataque es invalido. Reintentar otra vez :) .");
                } else {
                    break;  
                }
            
        } catch (IOException ex) {
            System.out.println("Hubo un lamentable error al intentar  leer esta entrada. "
                    + "Reintentar otra vez :).");
                ex.printStackTrace();
        }catch (NumberFormatException ex) {
            System.out.println("¿Serías tan amable de ingresar un numero que si pueda ser valido? "
                    + ". Reintentar otra vez :) ");
        }
    }
        ent.instruirMovimientoAlPokemonActual(oponente, escAtaque - 1);
    
    }
    private void cambiarDePokemon(Entrenador ent) {
        System.out.println("¿Deseas realizar un cambio de pokemones? (S/N)");
        char respuesta = 'N';

        while (true) {
        try {
            respuesta = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
            break;
        } catch (IOException ex) {
            System.out.println("Hubo una equivocacion  de entrada o salida al intentar leer."
                    + " Reintentar otra vez :).");
            ex.printStackTrace();
        }
    }

        if (respuesta == 'S' || respuesta == 'S') {

            System.out.println("Estos Pokemones pueden ser  utilizados:");
            int idx = 1;
            for (Pokemon pokemon : ent.getPokemonsCapturados()) {
                System.out.println(idx + ".- " + pokemon.getClass().getSimpleName());
                idx++;
            }

            System.out.println("Seleccione a un  pokemon que no a participado:");

            char auxLectura = '0';

            try {
                auxLectura = (char) System.in.read();
                System.in.read((new byte[System.in.available()]));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
           int pokemonNew = Character.getNumericValue(auxLectura) - 1;
           if (pokemonNew >= 0 && pokemonNew < ent.getPokemonsCapturados().size()) {
                Pokemon nuevoPokemon = ent.getPokemonsCapturados().get(pokemonNew);
                ent.setPokemonActual(nuevoPokemon);
                System.out.println("Seleccionanste  a este pokemon" +
                        nuevoPokemon.getClass().getSimpleName() + " en tu pandilla.");
            } else {
                System.out.println("Esta seleccion  de Pokemon es lamentablemente invalida. "
                        + "Reintentar otra vez :) ");
            }
        }
    }
}