package com.zilla.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zilla.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{

}
