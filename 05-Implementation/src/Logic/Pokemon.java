package Logic;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static Persistance.DBCon.getConnectionDB;

public class Pokemon {

    public void addPokemon(String name, String type) {

        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = getConnectionDB().prepareStatement("CREATE TABLE IF NOT EXISTS pokemon (id int primary key unique auto_increment," + "name varchar(55), type varchar(55))");
            preparedStatement.executeUpdate();
            System.out.println("Create Table");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (getConnectionDB() != null) {
                try {
                    getConnectionDB().close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            preparedStatement = getConnectionDB().prepareStatement("INSERT INTO pokemon (name, type) VALUES ('"+name+"', '"+type+"');");
            preparedStatement.executeUpdate();
            System.out.println("INSERT INTO pokemon");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (getConnectionDB() != null) {
                try {
                    getConnectionDB().close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void deletePokemon(int id) {

    }

    public void find(String name, String type) {

    }

    public void choosePokemon(String name, String type) {

    }

    public void specifyPokemon(String name, String type) {

    }
}
