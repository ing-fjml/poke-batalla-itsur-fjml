package mx.edu.itsur.pokebatalla;


import mx.edu.itsur.pokebatalla.model.Pokemons.Aerodactyl;
import mx.edu.itsur.pokebatalla.model.Pokemons.Charmander;
import mx.edu.itsur.pokebatalla.model.Pokemons.Dratini;
import mx.edu.itsur.pokebatalla.model.Pokemons.Evee;
import mx.edu.itsur.pokebatalla.model.Pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.battles.Batalla;
import mx.edu.itsur.pokebatalla.model.battles.Entrenador;
import mx.edu.itsur.pokebatalla.moves.ControladorArchivos.FileManajer;

/**
@author Francisco gonzalez Regalado
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("¡BIENVENIDO A LA POKEBATALLA!");
        
      
        
        
        Pikachu pikachuSalvaje = new Pikachu();
        Charmander charmanderSalvaje = new Charmander() ;       
        Evee PokemonEve1 = new Evee("Eve");
        Aerodactyl PokemonAero1 = new Aerodactyl("Aero");
        Dratini PokemonDra1 = new   Dratini("DRA");
        Charmander PokemonChar1 = new Charmander("Char");
        
        Entrenador n1 = new Entrenador("ASH");
        n1.capturarPokemon(PokemonDra1);
        n1.capturarPokemon(PokemonChar1);
        Entrenador n2 = new Entrenador("RED");
        n2.capturarPokemon(PokemonEve1);
        n2.capturarPokemon(PokemonAero1);
        
        
        Batalla v = null;
        
        Batalla batallaguardada = FileManajer.leerPartida();
        
        if(batallaguardada != null){
            
        v = batallaguardada;

        }else{
            v = new Batalla(n1,n2);
        
        }
        v.desarrollarBatalla();
        
    }
    
}
