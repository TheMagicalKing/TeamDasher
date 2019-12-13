package Persistance;

import java.sql.SQLException;

public class DBFacade {

    public static void main(String[] args) throws SQLException {
        PokemonMapper.specifyPokemon("Charizard","Fire",PokemonMapper.addPokemon());
    }


}
