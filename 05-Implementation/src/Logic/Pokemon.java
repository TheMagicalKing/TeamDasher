package Logic;

import javafx.collections.ObservableList;

import javax.xml.namespace.QName;
import java.sql.SQLException;

public class Pokemon {

    private String name;
    private String type;

    public Pokemon (){
    this.name = "";
    this.type = "";
    }

    public Pokemon (String name, String type){
    this.name = name;
    this.type = type;
    }

    public static ObservableList<Pokemon> initializeDasherDex() throws SQLException {
        return Persistance.PokemonMapper.getPokemon();
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getType() {return type;}

    public void setType(String type) {
        
        this.type = type;
    }
}
