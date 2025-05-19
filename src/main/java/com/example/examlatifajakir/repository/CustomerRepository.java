package com.example.examlatifajakir.repository;

import com.example.examlatifajakir.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
