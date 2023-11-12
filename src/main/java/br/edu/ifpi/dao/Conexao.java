package br.edu.ifpi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

  public static Connection getConexao() {
    try {
      Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_aula",
          "postgres", "12345");
      return conexao;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }
}
