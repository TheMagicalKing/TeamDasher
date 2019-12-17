package Persistance;
import Logic.Pokemon;

import java.sql.SQLException;

public class DBFacade {

    public void DBFacade(String name, int type) throws SQLException {
        System.out.println(type);
        PokemonMapper.specifyPokemon(name, type, PokemonMapper.addPokemon());
    }

    public void DBFacade(int pid) throws SQLException {
        PokemonMapper.deletePokemon(pid);
    }

    public static void main(String[] args) throws SQLException {
        PokemonMapper.findPokemon("name", "char");
    }
}
