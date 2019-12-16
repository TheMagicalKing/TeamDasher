package Persistance;
import java.sql.*;

public class PokemonMapper {

    private static Connection conDB;
    private static PreparedStatement prestmt;
    static ResultSet result;

    public static int addPokemon() throws SQLException {

        conDB = DBCon.getConnectionDB();
        String queryString="insert into pokemontable(name, type) values('','');";
        prestmt = conDB.prepareStatement(queryString);
        prestmt.execute();
        queryString = "select pid from pokemontable order by pid desc limit 1;";
        prestmt = conDB.prepareStatement(queryString);
        result = prestmt.executeQuery();
        result.next();
        int pid = result.getInt(1);
        System.out.println(pid);
        return pid;

    }

    public static void specifyPokemon(String name, String type, int pid) throws SQLException {

        String queryString="update pokemontable set name=?, type=? where pid = "+ pid +";";
        prestmt = conDB.prepareStatement(queryString);
        prestmt.setString(1, name);
        prestmt.setString(2, type);
        prestmt.execute();

    }

    public void deletePokemon(int id) {

    }

    public static int findPokemon(String searchTerm, String userinput) throws SQLException {
        conDB = DBCon.getConnectionDB();
        String queryString="select * from pokemontable where ? like '%'?'%';";
        prestmt = conDB.prepareStatement(queryString);
        prestmt.setString(1, searchTerm);
        prestmt.setString(2, userinput);
        prestmt.executeQuery();
        while(result.next()){
            String pname = result.getString("name");
            String ptype = result.getString("type");
            System.out.println(pname + ptype);
        }
        int pid = 0;
        return pid;
    }

    public void choosePokemon(String name, String type) {


    }
}
