/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bblioteca.eno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Aluno
 */
public class functions {
     public ResultSet execute(String sql,String type)
    {
        //variavel para obter o resultado da consulta sql
      ResultSet rs = null;
      try
      {
        //nome do driver a ser utilizado para conexao com banco de dados
        String myDriver = "org.gjt.mm.mysql.Driver";
        //endereço do banco de dados
        String myUrl = "jdbc:mysql://localhost/biblioteca";
        //inicializando o driver
        Class.forName(myDriver);
        //abrir conexao com banco de dados
        Connection conn = DriverManager.getConnection(myUrl, "root", "");        
        //comando sql para ser executado
        String query = sql; 
        //objeto para executar o comando sql
        Statement st = conn.createStatement();
        
        //se o tipo for insert
        if(type.equals("INSERT"))
        {
            //executeUpdate para inserir dados na tabela
            st.executeUpdate(query);
        }
        else
        {
            //para pegar o retorno do comado sql , exemplo SELECT
            rs = st.executeQuery(query);
        }
        // execute the query, and get a java resultset
        
        
        
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      //retornando o resultado da consulta
      return rs;
      
    }
}
