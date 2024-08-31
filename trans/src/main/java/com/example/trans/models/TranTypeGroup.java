package com.example.trans.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "TRANSTYPEGROUP")
public class TranTypeGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSTYPEGROUPID")
    private Long tranTypeGroupId;

    @Column(name = "NAME", length = 20)
    private String name;

   /* @OneToMany(mappedBy = "tranTypeGroup")
    private List<TranType> tranTypeList;
*/
    public Long getTranTypeGroupId() {
        return tranTypeGroupId;
    }

    public void setTranTypeGroupId(Long tranTypeGroupId) {
        this.tranTypeGroupId = tranTypeGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public List<TranType> getTranTypeList() {
        return tranTypeList;
    }

    public void setTranTypeList(List<TranType> tranTypeList) {
        this.tranTypeList = tranTypeList;
    }*/

    // Getters and Setters
}


