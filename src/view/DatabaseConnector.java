package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.InformationTable;
import model.ThermalTable;
import java.sql.*;

public class DatabaseConnector
{
  private Connection connection;

  public void connect(String host, int portNo, String userName, String password) {
    // Establishing a PostgreSQL database connection
    String databaseUrl = "jdbc:postgresql://" + host + ":" + portNo + "/" + userName;

    try {
      connection = DriverManager.getConnection(databaseUrl, userName, password);
      System.out.println("Connection established to: " + databaseUrl);
    }
    catch (Exception exception) {
      System.out.println("Connection failed");
      exception.printStackTrace();
    }
  }


  public ObservableList<ThermalTable> retrieveThermalTable() {
    ObservableList<ThermalTable> result = FXCollections.observableArrayList();

    String sql = "SELECT datestamp, time, tempOut, tempCONTROL, tempIn FROM public.ThermalTable GROUP BY datestamp;";

    try {
      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery(sql); // use the executeQuery() function when a result is expected

      while (resultSet.next()) { // Goes to the next row of data if available
        ThermalTable thTable = new ThermalTable(resultSet.getDate(1), resultSet.getFloat(2),
            resultSet.getFloat(3), resultSet.getFloat(4), resultSet.getFloat(5));
        result.add(thTable);
      }

    } catch (SQLException e) {
      System.out.println("Error trying to generate table of Thermal Panels");
      e.printStackTrace();
    }
    return result;
  }

  public ObservableList<InformationTable> retrieveInformationTable() {
    ObservableList<InformationTable> result = FXCollections.observableArrayList();

    String sql1 = "SELECT manufacturer, placementRow, placementColumn, installDate, contactInfoEmail, contactInfoPhone FROM public.InformationTable GROUP BY installDate;";

    try {
      Statement statement = connection.createStatement();
      ResultSet resultSet1 = statement.executeQuery(sql1); // use the executeQuery() function when a result is expected

      while (resultSet1.next()) { // Goes to the next row of data if available
        InformationTable inTable = new InformationTable(resultSet1.getString(1), resultSet1.getInt(2), resultSet1.getInt(3),
            resultSet1.getDate(4), resultSet1.getString(5), resultSet1.getInt(6));
        result.add(inTable);
      }

    } catch (SQLException e) {
      System.out.println("Error trying to generate table of Information Panels");
      e.printStackTrace();
    }
    return result;
  }




  public void close() {
    try {
      connection.close();
      System.out.println("Connection closed");
    } catch (SQLException exception) {
      System.out.println("Connection closing failed");
      exception.printStackTrace();
    }
  }

  private Timestamp convertToSqlTimestamp(java.util.Date uDate) {
    Timestamp timestamp = new Timestamp(uDate.getTime());
    return timestamp;
  }

}
