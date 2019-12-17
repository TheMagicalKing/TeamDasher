package Logic;

import javafx.collections.ObservableList;

import java.sql.SQLException;

public class Pokemon {

    private String name;
    private int type;

    public Pokemon (){
    this.name = "";
    this.type = 0;
    }

    public Pokemon (String name, int type){
    this.name = name;
    this.type = type;
    }

    public static ObservableList<Pokemon> initializeDasherDex() throws SQLException {
        return Persistance.PokemonMapper.getPokemon();
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getType() {return type;}

    public void setType(int type) {
        
        this.type = type;
    }
}
