package com.example.trans.models;

import jakarta.persistence.*;
//import java.math.Double;
import java.time.LocalDate;

@Entity
@Table(name = "TRANS")
public class Trans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSID")
    private Long transId;

    @Column(name = "ACCOUNTID")
    private Long accountId;

    @Column(name = "STATEMENTID")
    private Long statementId;

    @ManyToOne
    @JoinColumn(name = "TRANSTYPEID")
    private TranType tranType;

    @Column(name = "DESCRIPTION", length = 80)
    private String description;

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

    public Long getStatementId() {
        return statementId;
    }

    public void setStatementId(Long statementId) {
        this.statementId = statementId;
    }

    public TranType getTranType() {
        return tranType;
    }

    public void setTranType(TranType tranType) {
        this.tranType = tranType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Long getTransRefId() {
        return transRefId;
    }

    public void setTransRefId(Long transRefId) {
        this.transRefId = transRefId;
    }

    public LocalDate getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDate lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    @Column(name = "POSTDATE")
    private LocalDate postDate;

    @Column(name = "TRANSAMT", precision = 12)
    private Double transAmt;

    @Column(name = "TRANSREFID")
    private Long transRefId;

    @Column(name = "LASTUPDATE")
    private LocalDate lastUpdate;

    @Column(name = "SOURCEID")
    private Long sourceId;



    // Getters and Setters
}
