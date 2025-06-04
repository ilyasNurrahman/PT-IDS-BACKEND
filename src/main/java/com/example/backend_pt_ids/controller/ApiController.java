package com.example.backend_pt_ids.controller;

import java.io.ObjectInputFilter.Status;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend_pt_ids.model.Transaction;
import com.example.backend_pt_ids.service.DataService;

@RestController
public class ApiController {

    private final DataService dataService;

    public ApiController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/api/viewData")
    public Map<String, Object> getViewData() {
        List<Transaction> transactions = dataService.getAllTransactions();
        List<Status> statuses = dataService.getAllStatuses();

        Map<String, Object> response = new HashMap<>();
        response.put("data", transactions);
        response.put("status", statuses);

        return response;
    }

}
