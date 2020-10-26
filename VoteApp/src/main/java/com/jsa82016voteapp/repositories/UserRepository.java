package com.jsa82016voteapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsa82016voteapp.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);

}
