package Logic;
import Persistance.DBFacade;

import java.sql.SQLException;

public class DasherDexCon  {
    public void DasherDexCon(String name, int type) throws SQLException {
        DBFacade addPokemon = new DBFacade();
        System.out.println(type);
        addPokemon.DBFacade(name,type);
    }
    public void DasherDexCon(int pid) throws SQLException {
        DBFacade deletePokemon = new DBFacade();
        deletePokemon.DBFacade(pid);
    }
    public void DasherDexCon(String name, int type, int pid) throws SQLException{
        DBFacade specifyPokemon = new DBFacade();
        specifyPokemon.DBFacade(name, type, pid);
    }

    public static void main(String[] args) throws SQLException {

    }
}
