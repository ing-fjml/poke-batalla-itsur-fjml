/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.battles;

import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

/**
 *
 * @author Francisco Gonzalez Regalado
 */
public class Batalla {

    //Atributos
    protected Entrenador entrenador1;
    protected Entrenador entrenador2;
    protected int turno = 1;
    protected boolean batallaFinalizada = false;

    //Constructor
    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = RED;
        this.entrenador2 = ASH_KETCHUM;
    }

    //Metodos

     public void desarrollarBatalla() {

    public void desarrollarBatalla() {

        //Variables que se utilizarán
        Entrenador entrenadorEnTurno = null;
        Entrenador entrenadorOponente = null;


        System.out.println("Que Comienze la Batalla!");

        System.out.println("COMINEZA LA BATALLA!!!");

        System.out.println(entrenador1.nombre + " V.S. " + entrenador2.nombre);
        System.out.println("-----------------------------------------");

        //La primera vez ambos entrenadores se elegiran Pokemons
        //1. El primer entrenador selecciona su pokemon.
        do {
            try {
                seleccionarPokemon(entrenador1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Solamente cuentas con "
                        + entrenador1.getPokemonsCapturados().size()

                        + " Elige tu Pokemon!!! ");
                        + " Elige alguno de ellos!!! ");

                entrenador1.setPokemonActual(null);
            }
        } while (entrenador1.getPokemonActual() == null);

        //2. El segundo entrenador selecciona su pokemon.
        do {
            try {
                seleccionarPokemon(entrenador2);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Solamente cuentas con "
                        + entrenador2.getPokemonsCapturados().size()
                        + " Elige alguno de ellos!!! ");
                entrenador2.setPokemonActual(null);
            }
        } while (entrenador2.getPokemonActual() == null);

       

        while (!batallaFinalizada) {

            //1. Asignar variables de entrenador acorde al turno.
            if (turno == 1) {
                entrenadorEnTurno = entrenador1;
                entrenadorOponente = entrenador2;
            } else {
                entrenadorEnTurno = entrenador2;
                entrenadorOponente = entrenador1;
            }
            System.out.println("Es el turno de: " + entrenadorEnTurno.nombre);

            //2. Se da opción al entrenador en turno de que cambie de Pokemon antes de escoger movimiento.
            System.out.println(entrenadorEnTurno.getNombre() + " tu Pokemon actual es: " + entrenadorEnTurno.getPokemonActual());
            System.out.println("El Pokemon de tu oponente " + entrenadorOponente.getNombre() + " es: " + entrenadorOponente.getPokemonActual());
            System.out.println("Deseas cambiar de Pokemon?");
            System.out.println("1 -> NO");
            System.out.println("2 -> SI");
            try {
                char auxLectura = (char) System.in.read(); //Leer opción seleccionada
                System.in.read(new byte[System.in.available()]); //Limpiar bufer

                if (auxLectura == '2') {
                    seleccionarPokemon(entrenadorEnTurno);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            //3. El entrenador en turno selecciona el ataque a utilizar.
            System.out.println("Que quieres hacer?");
            //entrenadorEnTurno.getPokemonActual().imprimirMovimientos();
            for (Enum movimiento : entrenadorEnTurno.getPokemonActual().getMovimientos()) {
                System.out.println(movimiento.ordinal() + 1 + " -> "
                        + movimiento.name());
            }

            try {
                char auxLectura = (char) System.in.read(); //Leer opción seleccionada
                System.in.read(new byte[System.in.available()]); //Limpiar bufer

                //3. El pokemon realiza el ataque.
                entrenadorEnTurno.instruirMovimientoAlPokemonActual(entrenadorOponente.getPokemonActual(), Character.getNumericValue(auxLectura) - 1);

            } catch (Exception ex) {
                ex.printStackTrace();
            }

            //4. Revisar si ya terminó la batalla 
            //     (Todos los pokemons del oponente quedan inhabilitados) 
            if (entrenadorOponente.estaDerrotado()) {
                //Si terminó, se ha terminado la batalla.
                System.out.println(entrenadorOponente.getNombre() + " esta derrotado!!!");
                System.out.println("Felicidades " + entrenadorEnTurno.getNombre() + "!! HAS GANADO LA BATALLA!!!");
                batallaFinalizada = true;
            } else {
                //5. Si nadie ha ganado aún, se cambia el turno y repite.
                if (turno == 1) {
                    turno = 2;
                } else {
                    turno = 1;
                }
            }
            System.out.println("-----------------------------------------");
        }

    }

    private void seleccionarPokemon(Entrenador ent) {
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

    }
}
