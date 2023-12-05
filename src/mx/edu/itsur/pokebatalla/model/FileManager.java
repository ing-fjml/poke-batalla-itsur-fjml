package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.battles.Batalla;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francisco gonzalez Regalado
 */
public class FileManager {

    public static final String FILE_NAME = "Partida_Guardada.txt";

    public static void guardarHaciaArchivo(Batalla batalla) {
        try {
            FileOutputStream flujoSalida = new FileOutputStream(FILE_NAME);
            ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(flujoSalida);
            
            escritorDeObjetos.writeObject(batalla);

        } catch (FileNotFoundException ex) {
            System.out.println("No se pudo crear el archivo");
        } catch (IOException ex) {
            System.out.println("Fallo al escribir el objeto en el archivo");
        }

    }

    public static Batalla leerDesdeArchivo() {
        try {

            FileInputStream flujoEntrada = new FileInputStream(FILE_NAME);
            ObjectInputStream lectorDeObjetos = new ObjectInputStream(flujoEntrada);
            
            return (Batalla) lectorDeObjetos.readObject();
            
        } catch (FileNotFoundException ex) {
            System.out.println("   NO SE DETECTO UNA PARTIDA GUARDADA!\n");
            System.out.println("-------------------------------------------\n");
        } catch (IOException ex) {
            System.out.println("Fallo al escribir el objeto en el archivo");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return null;        
    }



}