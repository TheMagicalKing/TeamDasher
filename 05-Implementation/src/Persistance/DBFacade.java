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
    public void DBFacade (String name, int type,int pid) throws SQLException{
            PokemonMapper.specifyPokemon(name, type, pid);
        }
        }


