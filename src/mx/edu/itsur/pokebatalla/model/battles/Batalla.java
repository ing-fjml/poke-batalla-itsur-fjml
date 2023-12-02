/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.battles;

import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;
<<<<<<< Updated upstream
=======
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

import mx.edu.itsur.pokebatalla.utilities.FileManager;
>>>>>>> Stashed changes

/**
 *
 * @author FJML1983
 */
public class Batalla {

    // Atributos
    protected Entrenador entrenador1;
    protected Entrenador entrenador2;
    protected int turno = 1;
    protected boolean batallaFinalizada = false;

    // Constructor
    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }

    // Métodos
    public void salvarProgreso() {
        FileManager.guardarPartida(this);
    }

    public void desarrollarBatalla() {
        // Variables que se utilizarán
        Entrenador entrenadorEnTurno = null;
        Entrenador entrenadorOponente = null;

        System.out.println("COMINEZA LA BATALLA!!!");
        System.out.println(entrenador1.nombre + " V.S. " + entrenador2.nombre);
        System.out.println("-----------------------------------------");

        do {

            try {
                seleccionarPokemon(entrenador1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Solo tienes a: "
                        + entrenador1.getPokemonsCapturados().size()
                        + " Elige alguno de ellos! ");
                entrenador1.setPokemonActual(null);
            }
        } while (entrenador1.getPokemonActual() == null);

        do {
            try {
                seleccionarPokemon(entrenador2);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Solo tienes a: "
                        + entrenador2.getPokemonsCapturados().size()
                        + " Elige alguno de ellos! ");
                entrenador2.setPokemonActual(null);
            }
        } while (entrenador2.getPokemonActual() == null);

       

        while (!batallaFinalizada) {

            if (turno == 1) {
                entrenadorEnTurno = entrenador1;
                entrenadorOponente = entrenador2;
            } else {
                entrenadorEnTurno = entrenador2;
                entrenadorOponente = entrenador1;
            }
            System.out.println("Es el turno de: " + entrenadorEnTurno.nombre);

            if (entrenadorEnTurno.getPokemonActual().getHp() > 0 && entrenadorOponente.getPokemonActual().getHp() > 0) {
                System.out.println(entrenadorEnTurno.getNombre() + " tu Pokemon actual es: " + entrenadorEnTurno.getPokemonActual());
                System.out.println("El Pokemon de tu oponente " + entrenadorOponente.getNombre() + " es: " + entrenadorOponente.getPokemonActual());
                System.out.println("Deseas cambiar de Pokemon?");
                System.out.println("1 -> NO");
                System.out.println("2 -> SI");
                System.out.println("");

                //Falta automatizar.
                System.out.println("Quieres guardar la partida?");
                System.out.println("Y -> SI");
                System.out.println("N -> NO");

                try {
                    char auxLectura = (char) System.in.read(); // Leer opción seleccionada
                    System.in.read(new byte[System.in.available()]); // Limpiar buffer

                    if (auxLectura == '2') {
                        seleccionarPokemon(entrenadorEnTurno);
                    } else if (auxLectura == 'Y' || auxLectura == 'y') {
                        salvarProgreso();
                        return;
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                System.out.println("Cual de los siguientes movimientos desea utilizar?");
                for (Enum movimiento : entrenadorEnTurno.getPokemonActual().getMovimientos()) {
                    System.out.println(movimiento.ordinal() + 1 + " -> "
                            + movimiento.name());
                }

                try {
                    char auxLectura = (char) System.in.read(); // Leer opción seleccionada
                    System.in.read(new byte[System.in.available()]); // Limpiar buffer

                    entrenadorEnTurno.instruirMovimientoAlPokemonActual(entrenadorOponente.getPokemonActual(), Character.getNumericValue(auxLectura) - 1);

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                if (entrenadorOponente.estaDerrotado()) {
                    // Si terminó, se ha terminado la batalla.
                    System.out.println(entrenadorOponente.getNombre() + " esta derrotado!");
                    System.out.println("Felicidades " + entrenadorEnTurno.getNombre() + "! HAS GANADO LA BATALLA!");
                    // Preguntar al usuario si desea eliminar el archivo
                    System.out.println("¿Deseas eliminar el archivo de partida? (Y/N)");

                    try {
                        char respuestaEliminar = (char) System.in.read(); // Leer respuesta del usuario
                        System.in.read(new byte[System.in.available()]); // Limpiar buffer

                        if (respuestaEliminar == 'Y' || respuestaEliminar == 'y') {
                            FileManager.borrarPartida(); // Eliminar el archivo
                            System.out.println("Archivo eliminado.");
                        } else {
                            System.out.println("El archivo no ha sido eliminado.");
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                    try {
                        char respuestaEliminar = (char) System.in.read(); // Leer respuesta del usuario
                        System.in.read(new byte[System.in.available()]); // Limpiar buffer

                        if (respuestaEliminar == 'Y' || respuestaEliminar == 'y') {
                            FileManager.borrarPartida(); // Eliminar el archivo
                            System.out.println("Archivo eliminado.");
                        } else {
                            System.out.println("El archivo no ha sido eliminado.");
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                    // Fin del juego
                    batallaFinalizada = true;
                } else {
                    salvarProgreso();
                    if (turno == 1) {
                        turno = 2;
                    } else {
                        turno = 1;
                    }
                }
                System.out.println("-----------------------------------------");

            } else if (entrenadorEnTurno.getPokemonActual().getHp() > 0 && entrenadorOponente.getPokemonActual().getHp() <= 0) {
                System.out.println(entrenadorEnTurno.getNombre() + " tu Pokemon actual es: " + entrenadorEnTurno.getPokemonActual());
                System.out.println("El Pokemon de tu oponente esta debilitado");
                if (entrenadorOponente.estaDerrotado()) {
                    // Si terminó, se ha terminado la batalla.
                    System.out.println(entrenadorOponente.getNombre() + " esta derrotado!");
                    System.out.println("Felicidades " + entrenadorEnTurno.getNombre() + "! HAS GANADO LA BATALLA!");
                    batallaFinalizada = true;
                } else {
                    System.out.println("Su pokemon esta debilidato tu oponente debe cambiarlo");
                    seleccionarPokemon(entrenadorOponente);
                }
                System.out.println("-----------------------------------------");

            } else if (entrenadorEnTurno.getPokemonActual().getHp() <= 0 && entrenadorOponente.getPokemonActual().getHp() > 0) {
                System.out.println("tu pokemon se debilito cambialo");
                System.out.println("El Pokemon de tu oponente " + entrenadorOponente.getNombre() + " es: " + entrenadorOponente.getPokemonActual());
                System.out.println("Deseas cambiar de Pokemon?");
                seleccionarPokemon(entrenadorEnTurno);
            }
        }
    }

    private void seleccionarPokemon(Entrenador ent) {
<<<<<<< Updated upstream
        char auxLectura = '0';
        //El entrenador selecciona el pokemon a utilizar.            
        System.out.println("Cual de los siguientes Pokemon desea utilizar " + ent.nombre + "?");
        int auxCount = 1;
        for (Pokemon p : ent.getPokemonsCapturados()) {
            System.out.println(auxCount + " -> " + p);
            auxCount++;
        }
        try {
            auxLectura = (char) System.in.read(); //Leer opción seleccionada
            System.in.read(new byte[System.in.available()]); //Limpiar bufer

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //Obtener el pokemon seleccionado de la lista.
        Pokemon pokemonSeleccionado = ent.getPokemonsCapturados()
                .get(Character.getNumericValue(auxLectura) - 1);

        ent.setPokemonActual(pokemonSeleccionado);
        System.out.println(ent.nombre + " ha seleccionado a: " + ent.getPokemonActual());
        System.out.println("-----------------------------------------");

=======
        // El entrenador selecciona el Pokémon a utilizar.
        boolean kk = false;
        while (!kk) {
            System.out.println("Cual de los siguientes Pokemon desea utilizar " + ent.nombre + "?");
            int auxCount = 1;

            for (Pokemon p : ent.getPokemonsCapturados()) {
                System.out.println(auxCount + " -> " + p);
                auxCount++;
            }

            try {
                int opcionSeleccionada = new Scanner(System.in).nextInt(); // Leer opción seleccionada

                // Validar si el número está dentro del rango válido
                if (opcionSeleccionada >= 1 && opcionSeleccionada <= ent.getPokemonsCapturados().size()) {
                    // Obtener el Pokémon seleccionado de la lista.
                    Pokemon pokemonSeleccionado = ent.getPokemonsCapturados().get(opcionSeleccionada - 1);
                    if (pokemonSeleccionado.getHp() > 0) {
                        ent.setPokemonActual(pokemonSeleccionado);
                        System.out.println(ent.nombre + " ha seleccionado a: " + ent.getPokemonActual());
                        System.out.println("-----------------------------------------");
                        kk = true;
                    } else {
                        if (ent.getPokemonsCapturados().get(0).getHp() == 0 && ent.getPokemonsCapturados().get(1).getHp() == 0) {
                            System.out.println("ya perdiste");

                            return;
                        }
                        System.out.println("");
                        System.out.println("Tu pokemon se debilito cambialo");
                    }

                } else {
                    System.out.println("Por favor, introduce un número válido.");
                }

            } catch (Exception ex) {
                System.out.println("Error: Introduce un número válido.");
            }
        }
>>>>>>> Stashed changes
    }

}
