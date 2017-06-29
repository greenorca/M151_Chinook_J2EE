package com.chinook.model;

/**
 * simple POJO class for Artist attributes
 * @author user
 *
 */
public class Artist {

	private int uid;
	private String name;
	
	public Artist(){
		
	}
	
	/**
	 * @param uid
	 * @param name
	 */
	public Artist(int uid, String name) {
		this.uid = uid;
		this.name = name;
	}
	/**
	 * @return the uid
	 */
	public int getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(int uid) {
		this.uid = uid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	
	
}
