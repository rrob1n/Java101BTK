import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {

    }

    public static void selectData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from  country where continent = 'Asia' and region = 'Middle East'");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()) {
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));

            }
            System.out.println(countries.size());

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public static void insertData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            String sql = "insert into city(Name,CountryCode,District,Population) values(?,?,?,?)";
            resultSet = statement.executeQuery();
            statement = connection.prepareStatement(sql);
            statement.setString(1, "Düzce");
            statement.setString(2, "TUR");
            statement.setString(3, "Türkiye");
            statement.setInt(4, 70000);
            statement.executeUpdate();

            System.out.println("Kayit eklendi!");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }

    }

    public static void updateData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            String sql = "update city set population=80000,district='Düzce' where id= ?";

            statement = connection.prepareStatement(sql);
            statement.setInt(1, 4082);
            statement.executeUpdate();

            System.out.println("Kayit guncellendi!");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
    public static void deleteData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            String sql = "delete from city where id= ?";

            statement = connection.prepareStatement(sql);
            statement.setInt(1, 4082);
            statement.executeUpdate();

            System.out.println("Kayit silindi!");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
}