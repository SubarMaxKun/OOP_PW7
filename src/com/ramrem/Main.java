package com.ramrem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

  public static void main(String[] args) throws SQLException {
    try (Connection connection = getNewConnection()) {
      assert (connection.isValid(1));
      assert (connection.isClosed());
    }
  }

  private static Connection getNewConnection() throws SQLException {
    String url = "jdbc:sqlite:C:/Users/subar/Desktop/OOP_PW7/src/com/ramrem/databases/sto.db";
    return DriverManager.getConnection(url);
  }
}
