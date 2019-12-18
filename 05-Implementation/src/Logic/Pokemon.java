package Logic;

import javafx.collections.ObservableList;

import javax.xml.namespace.QName;
import java.sql.SQLException;

public class Pokemon {
    private  String sletdether;
    private String name;
    private int type;
    private String typeord;
    private int pid;

    public Pokemon() {
        this.name = "";
        this.type = 0;
    }

    public Pokemon(String name, int type, Integer pid) {
        this.name = name;
        this.type = type;
        this.pid = pid;
    }

    public Pokemon(String name, String typeord, int pid) {
        this.name = name;
        this.typeord = typeord;
        this.pid = pid;
    }

    public static ObservableList<Pokemon> initializeDasherDex() throws SQLException {
        return Persistance.PokemonMapper.getPokemon();
    }

    public static ObservableList<Pokemon> searchDasherDexName(String searchTerm) throws SQLException {
        return Persistance.PokemonMapper.findPokemonName(searchTerm);
    }

    public static ObservableList<Pokemon> searchDasherDexType(String searchTerm) throws SQLException {
        return Persistance.PokemonMapper.findPokemonType(searchTerm);
    }

    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {

        this.type = type;
    }

    public String getTypeord() {
        return typeord;
    }

    public void setTypeord(String typeord) {
        this.typeord = typeord;
    }
}
