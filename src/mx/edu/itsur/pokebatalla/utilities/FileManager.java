/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.utilities;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import mx.edu.itsur.pokebatalla.model.battles.Batalla;

/**
 *
 * @author Brayan Eduardo González Parra-
 */
public class FileManager {

    public static final String PARTIDA_FILE_NAME = "Partida.txt";

    public static void guardarPartida(Batalla x) {
        try (ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(new FileOutputStream(PARTIDA_FILE_NAME))) {
            escritorDeObjetos.writeObject(x);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Batalla cargarPartida() {
        Batalla x = null;
        try (ObjectInputStream lectorDeObjetos = new ObjectInputStream(new FileInputStream(PARTIDA_FILE_NAME))) {
            x = (Batalla) lectorDeObjetos.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return x;
    }

    public static void borrarPartida() {
        File file = new File(PARTIDA_FILE_NAME);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Partida anterior eliminada.");
            } else {
                System.out.println("No se pudo eliminar la partida anterior.");
            }
        }
    }

    public static void borrarPartidaSiNoContinuar() {
        File file = new File(PARTIDA_FILE_NAME);
        if (file.exists()) {
            System.out.println("¿Deseas eliminar el archivo de partida? (Y/N)");
            try {
                char respuestaEliminar = (char) System.in.read();
                System.in.read(new byte[System.in.available()]);

                if (respuestaEliminar == 'Y' || respuestaEliminar == 'y') {
                    borrarPartida();
                    System.out.println("Archivo eliminado.");
                } else {
                    System.out.println("El archivo no ha sido eliminado.");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
