package pokebatalla.model.battels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import pokebatalla.pokemons.Pokemon;

/**
 *
 * @author Hannia Dinora Gonzalez Magaña
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
        System.out.println("  LA BATTLLA DA INICIO ");
        System.out.println("LOS OPONENTES SON: ");
        System.out.println(entrenador1.getNombre() + " V.S " + entrenador2.getNombre());

        System.out.println("");

        do {
            try {
                eligirPokemon(entrenador1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Solamente tienes:  " + "{" + entrenador1.getPokemonsCapturados().size() + "}" + "  Elige alguno de tus Pokemons");
                entrenador1.setPokemonActual(null);
            }
        } while (entrenador1.getPokemonActual() == null);

        do {
            try {
                eligirPokemon(entrenador2);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Solamente tienes:  " + "{" + entrenador2.getPokemonsCapturados().size() + "}" + "  Elige alguno de tus Pokemons");
                entrenador2.setPokemonActual(null);
            }
        } while (entrenador2.getPokemonActual() == null);

        
        while (!batallaFinalizada) {
            Entrenador entrenadorEnTurno = (turno == 1) ? entrenador1 : entrenador2;
            Entrenador oponente = (turno == 1) ? entrenador2 : entrenador1;

            System.out.println("Turno del entrenador: " + entrenadorEnTurno.getNombre());

            if (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().gethp() <= 0) {
                cambiarPokemon(entrenadorEnTurno);
            }

            seleccionarAtaque(entrenadorEnTurno, oponente.getPokemonActual());

            if (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().gethp() <= 0) {
                cambiarPokemon(entrenadorEnTurno);

                while (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().gethp() <= 0) {
                    System.out.println("No puedes avanzar sin cambiar de Pokemon.");
                    cambiarPokemon(entrenadorEnTurno);
                }
            }
            Pokemon pokemonEnTurno = entrenadorEnTurno.getPokemonActual();

            if (oponente.estaDerrotado()) {
                System.out.println("¡El entrenador " + oponente.getNombre() + " ha sido derrotado!");
                batallaFinalizada = true;
            } else {
                // Cambiar el turno
                turno = (turno == 1) ? 2 : 1;
            }
        }
    }

    private void eligirPokemon(Entrenador entrenadorEnturno) {
        int idx = 1;
        System.out.println("*****");
        for (Pokemon pokemon : entrenadorEnturno.getPokemonsCapturados()) {
            System.out.println(idx + ".- " + pokemon.getClass().getSimpleName());
            idx++;
            System.out.println("*****");
        }
        System.out.println("");
        System.out.println("Elige un  Pokemon " + entrenadorEnturno.getNombre());

        char auxLectura = '0';

        try {
            auxLectura = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Pokemon pokemonSeleccionado = entrenadorEnturno.getPokemonsCapturados()
                .get(Character.getNumericValue(auxLectura) - 1);
        entrenadorEnturno.setPokemonActual(pokemonSeleccionado);
    }

    //****************************Metodo para atacar****************************
    private void seleccionarAtaque(Entrenador entrenadorEnturno, Pokemon oponente) {

        Pokemon pokemonActual = entrenadorEnturno.getPokemonActual();

      
        System.out.println("Selecciona un ataque " + pokemonActual.getClass().getSimpleName() + ":");

        int idx = 1;

        for (Enum movimiento : pokemonActual.getMovimientos()) {
            System.out.println(idx + ".- " + movimiento);
            idx++;
        }
        System.out.println("*************************************");

        int opcionAtaque = -1;
        while (true) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String input = br.readLine();

                opcionAtaque = Integer.parseInt(input);

                if (opcionAtaque < 1 || opcionAtaque > pokemonActual.getMovimientos().length) {
                    System.out.println("Ataque no valido, Intentalo de nuevo.");
                } else {
                    break;
                }
            } catch (IOException ex) {
                System.out.println("Error al leer la entrada, Intentalo de nuevo.");
                ex.printStackTrace();
            } catch (NumberFormatException ex) {
                System.out.println("Por favor, ingrese un numero valido");
            }
        }

        entrenadorEnturno.instruirMovimientoAlPokemonActual(oponente, opcionAtaque - 1);
    }

    private void cambiarPokemon(Entrenador entrenador) {
        System.out.println("Deseas cambiar de Pokamon (Si/No)");

        char respuesta = 'N';

        while (true) {
            try {
                respuesta = (char) System.in.read();
                System.in.read((new byte[System.in.available()]));
                break;
            } catch (IOException ex) {
                System.out.println("Error de entrada o salida al leer la respuesta Intenta de nuevo.");
                ex.printStackTrace();
            }
        }

        if (respuesta == 'S' || respuesta == 's') {

            System.out.println("Pokemon disponibles:");
            int idx = 1;
            for (Pokemon pokemon : entrenador.getPokemonsCapturados()) {
                System.out.println(idx + ".- " + pokemon.getClass().getSimpleName());
                idx++;
            }

            System.out.println("Elige un nuevo Pokemon:");

            char auxLectura = '0';

            try {
                auxLectura = (char) System.in.read();
                System.in.read((new byte[System.in.available()]));
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            int indicePokemonNuevo = Character.getNumericValue(auxLectura) - 1;
            
            if (indicePokemonNuevo >= 0 && indicePokemonNuevo < entrenador.getPokemonsCapturados().size()) {
                Pokemon nuevoPokemon = entrenador.getPokemonsCapturados().get(indicePokemonNuevo);
                entrenador.setPokemonActual(nuevoPokemon);
                System.out.println("Has cambiado a " + nuevoPokemon.getClass().getSimpleName() + " en tu equipo.");
            } else {
                System.out.println("La opción de Pokémon no es válida. Intenta de nuevo.");
            }
        }
    }
}
