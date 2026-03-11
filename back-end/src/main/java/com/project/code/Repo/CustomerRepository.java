package com.project.code.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.code.Model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    public Customer findByEmail(String email);

    public Optional<Customer> findById(Long id);

    public List<Customer> findByName(String name);
}
