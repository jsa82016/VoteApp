package com.jsa82016voteapp.services;


import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;


import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class UserDetailsServicesTest {

	@SuppressWarnings("deprecation")
	@Test
	void test() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "pass1234";
		String encodedPass = encoder.encode("pass1234");
		System.out.println(encodedPass);
		assertThat(rawPassword, not(encodedPass));
	}


}
