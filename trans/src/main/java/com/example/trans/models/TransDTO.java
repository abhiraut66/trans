package com.example.trans.models;

import java.io.Serializable;
//import java.math.Double;
import java.time.LocalDate;

public class TransDTO implements Serializable {

        private Long transId;
        private Long accountId;
        private Long transtypeId;
        private LocalDate postDate;
        private Double transAmt;
        private String description;
        private Double runningBalance;
        private String transType;

        public TransDTO(Trans transaction, Double runningBalance) {
            this.transId = transaction.getTransId();
            this.accountId = transaction.getAccountId();
            this.transtypeId = transaction.getTranType().getTranTypeId();
            this.postDate = transaction.getPostDate();
            this.transAmt = transaction.getTransAmt();
            this.description = transaction.getDescription();
            this.runningBalance = runningBalance;
            transType = transaction.getTranType().getName();
        }

    public Long getTransId() {
        return transId;
    }

    public void setTransId(Long transId) {
        this.transId = transId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getTranstypeId() {
        return transtypeId;
    }

    public void setTranstypeId(Long transtypeId) {
        this.transtypeId = transtypeId;
    }

    public LocalDate getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }

    public Double getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(Double transAmt) {
        this.transAmt = transAmt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getRunningBalance() {
        return runningBalance;
    }

    public void setRunningBalance(Double runningBalance) {
        this.runningBalance = runningBalance;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }
}
