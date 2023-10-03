package com.rushi.firstproject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;


//@Document(collection  = "rushidetails")
public class Details {
    @Id
   private int rushiid;
    private String comapny;
    private int dob;

    public int getRushiid() {
        return rushiid;
    }

    public void setRushiid(int rushiid) {
        this.rushiid = rushiid;
    }

    public String getComapny() {
        return comapny;
    }

    public void setComapny(String comapny) {
        this.comapny = comapny;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public Details() {
    }

    @Override
    public String toString() {
        return "Details{" +
                "rushiid=" + rushiid +
                ", comapny='" + comapny + '\'' +
                ", dob=" + dob +
                '}';
    }
}
