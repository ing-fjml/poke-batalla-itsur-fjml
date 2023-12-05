package mx.edu.itsur.pokebatalla.moves.ControladorArchivos;

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
 * @author Francisco gonzalez Regalado
 */
public class FileManajer {

    public static final String Partida = "partida.txt";

    public static void guardarPartida(Batalla x) {
        
        try (ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(new FileOutputStream(Partida))) {
            escritorDeObjetos.writeObject(x);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Batalla leerPartida() {
        Batalla x = null;
        try (ObjectInputStream lectorDeObjetos = new ObjectInputStream(new FileInputStream(Partida))) {
            x = (Batalla) lectorDeObjetos.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return x;
    }
    
}
