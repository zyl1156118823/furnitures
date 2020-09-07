package com.mook.house.house.entity;

import java.math.BigInteger;

public class House {
    private BigInteger houseid;
    private String housename;
    private int houseprice;

    public House() {
    }

    public House(BigInteger houseid, String housename, int houseprice) {
        this.houseid = houseid;
        this.housename = housename;
        this.houseprice = houseprice;
    }

    public BigInteger getHouseid() {
        return houseid;
    }

    public void setHouseid(BigInteger houseid) {
        this.houseid = houseid;
    }

    public String getHousename() {
        return housename;
    }

    public void setHousename(String housename) {
        this.housename = housename;
    }

    public int getHouseprice() {
        return houseprice;
    }

    public void setHouseprice(int houseprice) {
        this.houseprice = houseprice;
    }
}
