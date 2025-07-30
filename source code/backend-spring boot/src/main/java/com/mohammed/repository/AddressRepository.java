package com.mohammed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohammed.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
