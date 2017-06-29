package com.chinook.controller;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * basic database connector class,
 * reads database url, type and credentials from META-INF/context.xml
 * @author user
 *
 */
public class DBConnector {
	
	private static DBConnector connector_ = null;
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public static DBConnector getInstance() throws Exception {
		if (connector_ == null){
			connector_ = new DBConnector();
		}
		return connector_;
	}
	
	/**
	 * private ctor to ensure this class cannot be instantiated from outside
	 */
	private DBConnector(){
		
	}
	
	/**
	 * provides a valid DB connection object
	 * @return
	 * @throws Exception
	 */
	public Connection getConnection() throws Exception {

		Context ctx = new InitialContext();
		DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mydatabase");
		Connection c = ds.getConnection();
		System.out.println("Created a new DB Connection...");
		return c;

	}

}
