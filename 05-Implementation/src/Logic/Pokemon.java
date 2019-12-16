package Logic;

import Persistance.DBCon;
import Persistance.PokemonMapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.xml.namespace.QName;
import java.sql.Connection;
import java.sql.SQLException;

public class Pokemon {
    public static Connection con = DBCon.getConnectionDB();

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

    public void addPokemon(String name, String type){}

    public void deletePokemon(int id){}


    public static void findPokemon(String name, String type) throws SQLException {

    }

    public void choosePokemon(String name, String type){}

    public void specifyPokemon(String name, String type){}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getType() {return type;}

    public void setType(String type) {
        
        this.type = type;
    }


}
