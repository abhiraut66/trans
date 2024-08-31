package com.example.trans.controller;

import com.example.trans.models.Trans;
import com.example.trans.models.TransDTO;
import com.example.trans.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/transactions")
    public List<TransDTO> getTransactions(
            @RequestParam Long accountId,
            @RequestParam LocalDate startDate,
            @RequestParam LocalDate endDate) {
        return transactionService.getTransactions(accountId, startDate, endDate);
    }
}

