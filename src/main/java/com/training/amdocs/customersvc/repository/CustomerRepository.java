package com.training.amdocs.customersvc.repository;

import com.training.amdocs.customersvc.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
