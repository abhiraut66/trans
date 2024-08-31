package com.example.trans.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "TRANSTYPE")
public class TranType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSTYPEID")
    private Long tranTypeId;

    @Column(name = "NAME", length = 80)
    private String name;

    @Column(name = "FEED")
    private Long feed;

    @ManyToOne
    @JoinColumn(name = "TRANSTYPEGROUPID")
    private TranTypeGroup tranTypeGroup;

    @Column(name = "TRANSDESCO")
    private Long transDesco;

    @Column(name = "MATCHTRANSTYPEID")
    private Long matchTranTypeId;

    @Column(name = "ACTION", length = 2)
    private String action;

    @Column(name = "DISPTRANSID")
    private Long dispTransId;

    public Long getTranTypeId() {
        return tranTypeId;
    }

    public void setTranTypeId(Long tranTypeId) {
        this.tranTypeId = tranTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getFeed() {
        return feed;
    }

    public void setFeed(Long feed) {
        this.feed = feed;
    }

    public TranTypeGroup getTranTypeGroup() {
        return tranTypeGroup;
    }

    public void setTranTypeGroup(TranTypeGroup tranTypeGroup) {
        this.tranTypeGroup = tranTypeGroup;
    }

    public Long getTransDesco() {
        return transDesco;
    }

    public void setTransDesco(Long transDesco) {
        this.transDesco = transDesco;
    }

    public Long getMatchTranTypeId() {
        return matchTranTypeId;
    }

    public void setMatchTranTypeId(Long matchTranTypeId) {
        this.matchTranTypeId = matchTranTypeId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Long getDispTransId() {
        return dispTransId;
    }

    public void setDispTransId(Long dispTransId) {
        this.dispTransId = dispTransId;
    }

    public Long getLongDescriptionId() {
        return longDescriptionId;
    }

    public void setLongDescriptionId(Long longDescriptionId) {
        this.longDescriptionId = longDescriptionId;
    }

    public Long getSecondDescriptionId() {
        return secondDescriptionId;
    }

    public void setSecondDescriptionId(Long secondDescriptionId) {
        this.secondDescriptionId = secondDescriptionId;
    }

    public String getPostAcc() {
        return postAcc;
    }

    public void setPostAcc(String postAcc) {
        this.postAcc = postAcc;
    }

    /*public List<TransactionDTO> getTransList() {
        return transList;
    }

    public void setTransList(List<TransactionDTO> transList) {
        this.transList = transList;
    }*/

    @Column(name = "LONGDESCRIPTIONID")
    private Long longDescriptionId;

    @Column(name = "SECONDDESCRIPTIONID")
    private Long secondDescriptionId;

    @Column(name = "POSTACC")
    private String postAcc;

   /* @OneToMany(mappedBy = "tranType")
    private List<TransactionDTO> transList;
*/
    // Getters and Setters
}

