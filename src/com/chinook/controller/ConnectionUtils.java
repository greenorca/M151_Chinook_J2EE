package com.chinook.controller;

import java.sql.Connection;

/**
 * just a middleware class
 * @author user
 *
 */
public class ConnectionUtils {
	public static Connection getConnection()
            throws Exception {
     
      return DBConnector.getInstance().getConnection();
      
  }
   
  public static void closeQuietly(Connection conn) {
      try {
          conn.close();
      } catch (Exception e) {
      }
  }

  public static void rollbackQuietly(Connection conn) {
      try {
          conn.rollback();
      } catch (Exception e) {
      }
  }
}
