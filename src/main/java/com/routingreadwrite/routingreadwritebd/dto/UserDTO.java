package com.routingreadwrite.routingreadwritebd.dto;

import java.io.Serializable;

import com.routingreadwrite.routingreadwritebd.entities.User;

public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String email;
	
	public UserDTO() {}
	
	public UserDTO(User client) {
		this.id = client.getId();
		this.name = client.getName();
		this.email = client.getEmail();
	}
	
	public UserDTO(Integer id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
