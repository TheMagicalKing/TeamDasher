package Persistance;

import Logic.Pokemon;

import java.sql.SQLException;

public class DBFacade {

    public void DBFacade(String name, String type) throws SQLException {
        PokemonMapper.specifyPokemon(name, type, PokemonMapper.addPokemon());
    }

    public static void main(String[] args) throws SQLException {
        PokemonMapper.findPokemon("name", "char");

    }
}
