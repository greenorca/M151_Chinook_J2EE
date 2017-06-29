package com.chinook.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinook.model.Album;
import com.chinook.model.Artist;


public class AlbumConnector {

	public static List<Album> queryAlbums(Connection conn, int artistId) throws SQLException {
	      String sql = "SELECT AlbumId, Title FROM album WHERE ArtistId=?";
	 
	      PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
	      pstm.setInt(1, artistId);
	      
	      ResultSet rs = pstm.executeQuery();
	      List<Album> list = new ArrayList<Album>();
	      while (rs.next()) {
	          int id = rs.getInt("AlbumId");
	          String title = rs.getString("Title");
	          
	          Album album = new Album(id, artistId, title);
	          
	          list.add(album);
	      }
	      System.out.println("found "+list.size()+" artists");
	      return list;
	  }
	 
	  
}
