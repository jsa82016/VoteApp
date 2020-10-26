package com.jsa82016voteapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Authority implements GrantedAuthority {

	private static final long serialVersionUID = 7295569180513654604L;
	@Id	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String authority;
	@ManyToOne
	private User user;

	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
