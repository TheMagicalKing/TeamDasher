package Persistance;

import Logic.Pokemon;

import java.sql.SQLException;

public class DBFacade {

    public void DBFacade(String name, String type) throws SQLException {
        PokemonMapper.specifyPokemon(name, type, PokemonMapper.addPokemon());
    }
    public void DBFacade(int pid) throws  SQLException{
        //PokemonMapper.deletePokemon (pid, PokemonMapper.deletePokemon());
    }
    public static void main(String[] args) throws SQLException {
        PokemonMapper.findPokemon("name", "char");

    }


}
