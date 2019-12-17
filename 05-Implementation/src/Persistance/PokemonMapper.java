package Persistance;

import Logic.Pokemon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.swing.table.TableColumn;
import java.sql.*;

public class PokemonMapper {

    private static Connection conDB;
    private static PreparedStatement prestmt;
    static ResultSet result;

    public static int addPokemon() throws SQLException {

        conDB = DBCon.getConnectionDB();
        String queryString="insert into pokemontable(name, type) values('',0);";
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

    public static void specifyPokemon(String name, int type, int pid) throws SQLException {

        String queryString="update pokemontable set name=?, type=? where pid = "+ pid +";";
        prestmt = conDB.prepareStatement(queryString);
        prestmt.setString(1, name);
        prestmt.setInt(2, type);
        prestmt.execute();

    }

    public static void deletePokemon(int pid) throws SQLException {
        Connection conn = DBCon.getConnectionDB();
        String queryString = "DELETE FROM pokemontable WHERE pid= ?;";
        prestmt = conn.prepareStatement(queryString);
        prestmt.setInt(1, pid);
        prestmt.execute();

    }
    public static ObservableList<Pokemon> findPokemonName(String searchTerm) throws SQLException {
        ObservableList<Pokemon> pokemonList = FXCollections.observableArrayList();

        Connection conn = DBCon.getConnectionDB();
        String queryString = "SELECT * from pokemontable where name LIKE ?";
        PreparedStatement ps = conn.prepareStatement(queryString);
        ps.setString(1, "%" + searchTerm + "%");
        System.out.println(ps);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            pokemonList.add(new Pokemon(rs.getString("name"), rs.getInt("type"), rs.getInt("pid")));
        }
        return pokemonList;
    }
    public static ObservableList<Pokemon> findPokemonType(String searchTerm) throws SQLException {
        ObservableList<Pokemon> pokemonList = FXCollections.observableArrayList();

        Connection conn = DBCon.getConnectionDB();
        String queryString = "SELECT * from pokemontable where type LIKE ?";
        PreparedStatement ps = conn.prepareStatement(queryString);
        ps.setString(1, "%" + searchTerm + "%");
        System.out.println(ps);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            pokemonList.add(new Pokemon(rs.getString("name"), rs.getInt("type"), rs.getInt("pid")));
        }
        return pokemonList;
    }

    public static ObservableList<Pokemon> getPokemon() throws SQLException {
        ObservableList<Pokemon> oblist = FXCollections.observableArrayList();

        Connection conn = DBCon.getConnectionDB();
        String queryString = "select * from pokemontable";
        prestmt = conn.prepareStatement(queryString);
        result = prestmt.executeQuery();
        while (result.next()) {
            oblist.add(new Pokemon(result.getString("name"), result.getInt("type"), result.getInt("pid")));
        }
        return oblist;
    }

    public void choosePokemon(String name, String type) {}
}
