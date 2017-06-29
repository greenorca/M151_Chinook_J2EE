package com.chinook.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinook.model.Album;

/**
 * handles DB connection for album table
 * @author user
 *
 */
public class AlbumConnector {

	/**
	 * returns all albums in DB that belong to the given artist
	 * @param conn
	 * @param artistId
	 * @return
	 * @throws SQLException
	 */
	public static List<Album> queryAlbums(Connection conn, int artistId) throws SQLException {
	      String sql = "SELECT AlbumId, Title FROM Album WHERE ArtistId=?";
	 
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
