package mx.edu.itsur.pokebatalla.moves;
import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;
/**
@author Francisco gonzalez Regalado
 */
public class Impactrueno extends MovimientoEspecial{
    
public Impactrueno(){
       this.tipo = TiposDeMovimiento.ELECTRICO;
        this.potencia = 40;
        this.precision = 100;
        this.puntosPoder = 30;
   }
public void utilizar(Pokemon usuario, Pokemon objetivo)
{
       int nivelUsuario;  
        int ataqueUsuario;  
        int potenciaMovimiento; 
        int defensaObjetivo; 
         /*
        B = Bonificación. Si el Pokémon no está teracristalizado: si el ataque es del mismo tipo que el Pokémon que lo lanza toma un valor de 1.5; si el ataque es de un tipo diferente al del Pokémon que lo lanza toma un valor de 1. Si el Pokémon está teracristalizado: si tanto su tipo original como su teratipo coinciden con el del movimiento, la bonificación será de 2; si sólo coincide su tipo original o su teratipo, será de 1.5; si no coincide ninguno, será de 1.
            Este contenido proviene de wikidex.net, y debe darse atribución a sus autores, tal como especifica la licencia.
            Se prohíbe su uso a PlagioDex (el wiki de FANDOOM), por copiar reiteradamente sin dar atribución
        */
        int bonificacion; 
        int efectividadMovimiento; 
}
}
