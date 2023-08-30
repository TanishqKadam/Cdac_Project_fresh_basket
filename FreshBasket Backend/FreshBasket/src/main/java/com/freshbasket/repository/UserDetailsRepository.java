package com.freshbasket.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freshbasket.pojos.User;

@Repository
public interface UserDetailsRepository extends JpaRepository<User, Integer> {
	
	Optional<User> getUserByEmailAndPassword(String email, String password);
	
}
