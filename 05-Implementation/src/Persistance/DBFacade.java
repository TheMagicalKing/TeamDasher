package Persistance;

import Logic.Pokemon;
import UI.sample.appControllers.MainMenuController;

import java.sql.SQLException;

public class DBFacade {



    public void DBFacade(String name, String type) throws SQLException {
        PokemonMapper.specifyPokemon(name, type, PokemonMapper.addPokemon());
        PokemonMapper.findPokemon(name, type); //<------ Name and type for Find pokemon is supposed to be searchParameter and userInput, however java constructors only look at the datatypes of the variables, not the variables themselves keeps this in mind.

    }


    public static void main(String[] args) throws SQLException {


    }
}
