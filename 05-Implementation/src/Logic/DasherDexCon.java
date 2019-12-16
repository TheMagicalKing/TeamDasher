package Logic;
import Persistance.DBFacade;
import Persistance.PokemonMapper;

import java.sql.SQLException;

public class DasherDexCon  {
    public void DasherDexCon(String name, String type) throws SQLException {
        DBFacade addPokemon = new DBFacade();
        addPokemon.DBFacade(name,type);
    }
    public void deletePokemon(int pid) throws SQLException {
        PokemonMapper.deletePokemon(pid);

    }
    public static void main(String[] args) throws SQLException {

    }
}
