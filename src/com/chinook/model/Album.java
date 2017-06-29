package com.chinook.model;

public class Album {
	int idAlbum;
	int idArtist;
	String title;
	/**
	 * @param idAlbum
	 * @param idArtist
	 * @param title
	 */
	public Album(int idAlbum, int idArtist, String title) {
		this.idAlbum = idAlbum;
		this.idArtist = idArtist;
		this.title = title;
	}
	/**
	 * @return the idAlbum
	 */
	public int getIdAlbum() {
		return idAlbum;
	}
	/**
	 * @param idAlbum the idAlbum to set
	 */
	public void setIdAlbum(int idAlbum) {
		this.idAlbum = idAlbum;
	}
	/**
	 * @return the idArtist
	 */
	public int getIdArtist() {
		return idArtist;
	}
	/**
	 * @param idArtist the idArtist to set
	 */
	public void setIdArtist(int idArtist) {
		this.idArtist = idArtist;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
