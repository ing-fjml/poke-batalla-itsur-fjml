package serializacionDeObjetosYArchivos;

import battles.Batalla;
//import java.io.BufferedWriter;
//import java.io.EOFException;
import java.io.File;
//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fatima Gutierrez Moreno
 */


    
public class FileManager {
      public static final String ConvatePorLaSupervivencia = "poke.txt";
    
      public static void guardarHaciaArchivo(Batalla k) {
    try (ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(new FileOutputStream(ConvatePorLaSupervivencia))){
          escritorDeObjetos.writeObject(k);
       } catch (IOException ex) {
       System.out.println("hubo un terrible error  al intentar escribir "
               + " en el archivo :( ");
      }
   }
    
    

    public static Batalla leerDesdeArchivo() {
        try {
            FileInputStream entrada = new FileInputStream(ConvatePorLaSupervivencia);
            ObjectInputStream lectorDeObjetos = new ObjectInputStream(entrada);

            return (Batalla) lectorDeObjetos.readObject();

        } catch (FileNotFoundException ex) {
            System.out.println("Hmm.lamentablemente no pudo ser leeido o "
                    + "creado el archivo hubo un error  ");
        } catch (IOException ex) {
            System.out.println("Lamentablemente hubo un  terrible error  al intentar"
                    + " escribir en el archivo :( . Intenta De nuevo :)  ");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void borrarConvate() {
        File archivo = new File(ConvatePorLaSupervivencia);
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("Convate exitosamente eliminado");

        }
    }
}






/*public static final String ConvatePorLaSupervivencia = "poke.txt";

    public static void PartidaGuardad(Batalla b) {
        try (ObjectOutputStream guardarObjectos = new ObjectOutputStream(new FileOutputStream(pokemones))) {
            guardarObjectos.writeObject(b);
        } catch (IOException ex) {
        }
    }
     */
 /* public static Batalla leerDesdeArchivo() {
        Batalla b = null;
        try (ObjectInputStream leerObjectos = new ObjectInputStream(new FileInputStream(ConvatePorLaSupervivencia ))) {
            b = (Batalla) leerObjectos.readObject();
        } catch (EOFException e) {
//            System.out.println("Hmm.lamentablemente no pudo ser leeido o "
//                   + "creado el archivo hubo un error  ");
        } catch (IOException | ClassNotFoundException ex) {
            
        }
        return b;
    }
     public void write () {
        try {
            String filename = "poke.txt"; // Nombre del archivo de salida
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);

            StringBuilder acu = new StringBuilder();
            
               // acu.append(" |"++"|" +"\n");
            
            bw.write(acu.toString());
            System.out.println("Texto escrito en el archivo correctamente.");
            
            bw.close();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
} 

    
    public static final String ConvatePorLaSupervivencia = "poke.txt";
    public static void guardarHaciaArchivo(Batalla k) {
    try (ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(new FileOutputStream(ConvatePorLaSupervivencia))){
          escritorDeObjetos.writeObject(k);
       } catch (IOException ex) {
       System.out.println("hubo un terrible error  al intentar escribir "
               + " en el archivo :( ");
      }
   }*/
