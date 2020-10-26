package com.jsa82016voteapp.models;

import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;

public class UserPrincipal implements UserDetails {

	private static final long serialVersionUID = -2441577848122993873L;
	
	private User user;
	
	public UserPrincipal(User user) {
		this.user=user;
 	}
	
	@Override
	public Set<Authority> getAuthorities() {
		return user.getAuthorities();
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getPassword();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
