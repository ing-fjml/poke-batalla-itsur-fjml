/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.utilities;

import java.io.*;
import mx.edu.itsur.pokebatalla.model.battles.Batalla;

/**
 *
 * @author Brayan Eduardo González Parra
 */
public class FileManager {

    public static final String FILE_NAME = "avances_pokemon.dat";

    public static void guardarAvance(Batalla batalla) {
        try (ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            escritorDeObjetos.writeObject(batalla);
            System.out.println("Avance guardado exitosamente.");
        } catch (IOException ex) {
            System.out.println("Error al guardar el avance del juego.");
        }
    }

    public static Batalla leerAvance() {
        try (ObjectInputStream lectorDeObjetos = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (Batalla) lectorDeObjetos.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontró el archivo de avance.");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error al leer el avance del juego.");
        }
        return null;
    }
}
