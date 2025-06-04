package com.example.backend_pt_ids.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend_pt_ids.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

}
