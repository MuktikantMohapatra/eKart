package com.ekart.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ekart.login.entities.Addrerss;
@Repository
public interface AddressRepository extends JpaRepository<Addrerss, Long> {

}
