package com.chinook.controller;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConnector {
	
	private static DBConnector connector_ = null;
	public static DBConnector getInstance() throws Exception {
		if (connector_ == null){
			connector_ = new DBConnector();
		}
		return connector_;
	}
	
	private DBConnector(){
		
	}
	
	public Connection getConnection() throws Exception {

		Context ctx = new InitialContext();
		DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mydatabase");
		Connection c = ds.getConnection();
		return c;

	}

}
