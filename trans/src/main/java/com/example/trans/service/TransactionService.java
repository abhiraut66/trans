package com.example.trans.service;


import com.example.trans.models.Trans;
import com.example.trans.models.TransDTO;
import com.example.trans.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;


    @Transactional(readOnly = true)
    public List<TransDTO> getTransactions(Long accountId, LocalDate startDate, LocalDate endDate) {
        Sort sort = Sort.by(Sort.Order.desc("transDate"), Sort.Order.desc("transId"));
        Pageable pageble = PageRequest.of(0, 3);
        Page<Trans> transactions = transactionRepository
                .findByAccountIdAndPostDateBetweenOrderByPostDateDescTransIdDesc(accountId, startDate, endDate,pageble);
        // BigDecimal runningBalance = BigDecimal.valueOf(2000.00);
        Double runningBalance = 2000.0;
        List<TransDTO> result = new ArrayList<>();
        for (Trans transaction : transactions) {
            //  runningBalance = runningBalance.add(transaction.getTransAmt());
            runningBalance += transaction.getTransAmt();
            TransDTO dto = new TransDTO(transaction, runningBalance);
            result.add(dto);
        }

        return result;
    }


}


