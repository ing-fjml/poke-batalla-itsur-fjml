/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokebatalla.model.utils;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import pokebatalla.model.battels.Batalla;

/**
 *
 * @author Hannia Dinora González Magaña
 */
public class fildeManager {

    public static final String pokemon = "pokemones.txt";

    public static void partidaGuardada (Batalla b) {
        try (ObjectOutputStream Objetos = new ObjectOutputStream(new FileOutputStream(pokemon))) {
            Objetos.writeObject(b);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Batalla leerPartida() {
        Batalla b = null;
        try (ObjectInputStream leerDeObjetos = new ObjectInputStream(new FileInputStream(pokemon))) {
            b= (Batalla) leerDeObjetos.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return b;
    }
    
}
