package Logic;

import javafx.collections.ObservableList;

import java.sql.SQLException;

public class Pokemon {

    private String name;
    private String type;

    public Pokemon (String name, String type){
    this.name = name;
    this.type = type;
    }

    public static ObservableList<Pokemon> initializeDasherDex() throws SQLException {
        return Persistance.PokemonMapper.getPokemon();
    }
/*
    public static ObservableList<Pokemon> searchDasherDex(String searchParameter, String searchTerm) throws SQLException {
        return Persistance.PokemonMapper.findPokemon(searchParameter, searchTerm);
    } */

public static ObservableList<Pokemon> searchDasherDexName(String searchTerm) throws SQLException {
    return Persistance.PokemonMapper.findPokemonName(searchTerm);
}
    public static ObservableList<Pokemon> searchDasherDexType(String searchTerm) throws SQLException {
        return Persistance.PokemonMapper.findPokemonType(searchTerm);
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getType() {return type;}

    public void setType(String type) {
        
        this.type = type;
    }
}
