package com.chinook.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinook.model.Artist;


public class ArtistConnector {

	public static List<Artist> queryArtists(Connection conn) throws SQLException {
	      String sql = "SELECT ArtistId, Name FROM artist";
	 
	      PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
	 
	      ResultSet rs = pstm.executeQuery();
	      List<Artist> list = new ArrayList<Artist>();
	      while (rs.next()) {
	          int id = rs.getInt("ArtistId");
	          String name = rs.getString("Name");
	          
	          Artist artist = new Artist(id,name);
	          
	          list.add(artist);
	      }
	      System.out.println("found "+list.size()+" artists");
	      return list;
	  }
	 
	  public static Artist findArtists(Connection conn, int code) throws SQLException {
	      String sql = "Select ArtistId, Name FROM artist where a.ArtistName=?";
	 
	      PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
	      pstm.setLong(1, code);
	 
	      ResultSet rs = pstm.executeQuery();
	 
	      while (rs.next()) {
	          String name = rs.getString("Name");
	          Artist product = new Artist(code, name);
	          return product;
	      }
	      return null;
	  }
}
