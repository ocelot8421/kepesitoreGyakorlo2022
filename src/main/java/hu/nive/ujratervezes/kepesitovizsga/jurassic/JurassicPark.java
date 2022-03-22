package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import static hu.nive.ujratervezes.kepesitovizsga.jurassic.DataSource.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {
    Connection connection;

    public JurassicPark() {
        try {
            this.connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            createTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public List<String> checkOverpopulation() {

        List<String> dinosWithHighLibido = new ArrayList<>();
        String sql = "SELECT * FROM dinosaur ORDER by breed";

        try (Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int label = resultSet.getInt("actual") - resultSet.getInt("expected");
                if (label > 0) {
                    dinosWithHighLibido.add(resultSet.getString("breed"));
                }
            }

        } catch (SQLException se) {
            se.printStackTrace();
        }

        return dinosWithHighLibido;
    }

    private void createTable() {
        String sqlCreateTable = "CREATE TABLE IF NOT EXISTS dinosaur (" +
                "breed VARCHAR(50) NOT NULL," +
                "expected INT, " +
                "actual INT, " +
                "PRIMARY KEY (breed) " +
                ")";
        try (Statement statement = connection.createStatement()) {
            statement.execute(sqlCreateTable);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }
}
