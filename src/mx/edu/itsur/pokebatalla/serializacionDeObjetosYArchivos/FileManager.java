package serializacionDeObjetosYArchivos;
import battles.Batalla;
//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Fatima Gutierrez Moreno
 */
public class FileManager  {
    
    public static final String ConvatePorLaSupervivencia = "poke.txt";
    public static void guardarHaciaArchivo(Batalla k) {
    try (ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(new FileOutputStream(ConvatePorLaSupervivencia))){
          escritorDeObjetos.writeObject(k);
       } catch (IOException ex) {
       System.out.println("hubo un terrible error  al intentar escribir "
               + " en el archivo :( ");
      }
   }

//    public static void guardarHaciaArchivo(Batalla k) {
//        try {
//            FileOutputStream salida = new FileOutputStream(ConvatePorLaSupervivencia);
//            ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(salida);
//            escritorDeObjetos.writeObject(k);
//
//        } catch (IOException ex) {
//            System.out.println("hubo un terrible error  al intentar escribir "
//                    + " en el archivo :( ");
//        }
//
//    }

      public static Batalla  leerDesdeArchivo() {
        try { 
            FileInputStream entrada = new FileInputStream(ConvatePorLaSupervivencia);
            ObjectInputStream lectorDeObjetos = new ObjectInputStream(entrada);
            
            return (Batalla ) lectorDeObjetos.readObject();
            
        } catch (FileNotFoundException ex) {
////            System.out.println("Hmm.lamentablemente no pudo ser leeido o "
////                    + "creado el archivo hubo un error  ");
        } catch (IOException ex) {
            System.out.println("Lamentablemente hubo un  terrible error  al intentar"
                    + " escribir en el archivo :( . Intenta De nuevo :)  ");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return null;        
    }

//  public static void borrarConvate(){
//        File archivo = new File (ConvatePorLaSupervivencia );
//        if(archivo.exists()){
//            archivo.delete();
//            System.out.println("Convate exitosamente eliminado");
//        
//        }
//    
//    }
    
    }




