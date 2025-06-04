package com.example.backend_pt_ids.service;

import org.springframework.stereotype.Service;

import com.example.backend_pt_ids.model.Transaction;
import com.example.backend_pt_ids.repository.StatusRepository;
import com.example.backend_pt_ids.repository.TransactionRepository;

import java.io.ObjectInputFilter.Status;
import java.util.List;

@Service
public class DataService {

    private final TransactionRepository transactionRepository;
    private final StatusRepository statusRepository;

    public DataService(TransactionRepository transactionRepository, StatusRepository statusRepository) {
        this.transactionRepository = transactionRepository;
        this.statusRepository = statusRepository;
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public List<Status> getAllStatuses() {
        return statusRepository.findAll();
    }

}
