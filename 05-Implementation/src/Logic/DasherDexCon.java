package Logic;
import Persistance.DBFacade;

import java.sql.SQLException;

public class DasherDexCon  {
    public void DasherDexCon(String name, String type) throws SQLException {
        DBFacade addPokemon = new DBFacade();
        addPokemon.DBFacade(name,type);
    }
    public static void main(String[] args) throws SQLException {

    }
}
