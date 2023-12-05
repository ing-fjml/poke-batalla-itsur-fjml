package mx.edu.itsur.pokebatalla.model.battles;
import java.io.Serializable;
import java.util.List;
import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;
import java.util.ArrayList;
/**
 *@author Francisco gonzalez Regalado
 */
public class Entrenador implements Serializable{
    //Atributos

    protected List<Pokemon> pokemonsCapturados;
    protected String nombre;
    protected Pokemon PokemonActual;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemonsCapturados = new ArrayList<>();
    }

    //Metodos
    public void capturarPokemon(Pokemon pk) {
        pokemonsCapturados.add(pk);
    }
    
    public void IntruirMovimientoActualAlPokemon(Pokemon Oponenete, int OrdinalMoviento)
    {
        if(PokemonActual == null)
        {
            System.out.println("NO HAY UN POKEMON ACTUAL");
            return;
        }
        
        if(OrdinalMoviento < 0 || OrdinalMoviento >= PokemonActual.getMovimientos().length)
        {
            System.out.println("EL ORDINAL MOVIMIENTO NO ES VALIDO");
            return;
        }
        this.PokemonActual.atacar(Oponenete, OrdinalMoviento);
    }
    
public boolean estaDerrotado() {
        for (Pokemon pokemon : pokemonsCapturados) {

            if (pokemon.gethp() > 0) {
                return false;
            }
        }
        return true;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

  public Pokemon getPokemonActual() {
        return PokemonActual;
    }

    public void setPokemonActual(Pokemon p) {
        this.PokemonActual = p;
    }

    public List<Pokemon> getPokemonsCapturados() {
        return pokemonsCapturados;
    }
   
}
