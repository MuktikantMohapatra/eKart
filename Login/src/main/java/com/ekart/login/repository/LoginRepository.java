package com.ekart.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ekart.login.entities.LoginDetails;
@Repository
public interface LoginRepository extends JpaRepository<LoginDetails, Long> {
	LoginDetails findByEmail(String email);
}
