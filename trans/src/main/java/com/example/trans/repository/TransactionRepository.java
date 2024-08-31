package com.example.trans.repository;

import com.example.trans.models.Trans;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Trans, Long> {
    Page<Trans> findByAccountIdAndPostDateBetweenOrderByPostDateDescTransIdDesc(Long accountId, LocalDate startDate, LocalDate endDate,Pageable pageble);

   // List<Trans> findByAccountId(Long accountId);

}
