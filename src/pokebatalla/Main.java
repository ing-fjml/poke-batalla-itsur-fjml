/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokebatalla;

/**
 *
 * @author FJML1983
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
        
        Pikachu p1 = new Pikachu(); //Instanciando       
        Pikachu p2 = new Pikachu(); //Instanciando               
        Charmander cha1 = new Charmander();   //Instanciando                     
        Bullbasaur b1 = new Bullbasaur();//Instanciando
        
        
        p1.atacar(cha1);
        p1.atacar(b1);
        cha1.atacar(b1);
        b1.atacar(p1);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(cha1);
        System.out.println(b1);
        
    }
    
}
