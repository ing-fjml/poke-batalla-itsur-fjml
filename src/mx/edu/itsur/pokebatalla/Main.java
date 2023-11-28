/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.battles.Batalla;
import mx.edu.itsur.pokebatalla.model.battles.Entrenador;
import mx.edu.itsur.pokebatalla.model.pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmander;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmeleon;
import mx.edu.itsur.pokebatalla.model.pokemons.Blastoise;
import mx.edu.itsur.pokebatalla.model.pokemons.Ekans;
import mx.edu.itsur.pokebatalla.utilities.FileManager;

/**
 *
 * @author Brayan Eduardo González Parra
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello PokeBatalla!");

        //Instanciar pokemons
        Pikachu pika = new Pikachu();
        Charmander charm = new Charmander();
        Bullbasaur bullb = new Bullbasaur();
        Ekans ekansSalvaje = new Ekans();
        Blastoise blastoiseSalvaje = new Blastoise();
        Charmeleon charmeleonSalvaje = new Charmeleon();

        //Instanciar entrenadores y que capturen pokemons
        Entrenador ent1 = new Entrenador("Parra");
        ent1.capturarPokemon(pika);
        ent1.capturarPokemon(bullb);
        ent1.capturarPokemon(blastoiseSalvaje);

        Entrenador ent2 = new Entrenador("Brayan");
        ent2.capturarPokemon(charm);
        ent2.capturarPokemon(ekansSalvaje);
        ent2.capturarPokemon(charmeleonSalvaje);

        try {

            //Instanciar batalla e iniciarla.
            Batalla b = new Batalla(ent1, ent2);
            b.desarrollarBatalla();

            FileManager.guardarAvance(b);

        } catch (Exception e) {
            System.out.println("Error durante la batalla: " + e.getMessage());

        }
        Batalla avanceGuardado = FileManager.leerAvance();
        if (avanceGuardado != null) {
            System.out.println("Avance recuperado exitosamente.");
        } else {
            System.out.println("No se pudo recuperar el avance.");
        }
        Batalla avanceAnterior = FileManager.leerAvance();

        if (avanceAnterior != null) {
            System.out.println("Se ha cargado un avance anterior. Continuando la batalla...");
            avanceAnterior.desarrollarBatalla();
        } else {
            try {
                Batalla nuevaBatalla = new Batalla(ent1, ent2);
                nuevaBatalla.desarrollarBatalla();

                FileManager.guardarAvance(nuevaBatalla);
            } catch (Exception e) {
                System.err.println("Error durante la batalla: " + e.getMessage());
            }
        }
    }
}
