package com.mook.house.house.entity;

import java.math.BigInteger;

public class HouseuserVo {
    private BigInteger userid;
    private  BigInteger houseid;
    private House house;

    public HouseuserVo() {
    }

    public HouseuserVo(BigInteger userid, BigInteger houseid, House house) {
        this.userid = userid;
        this.houseid = houseid;
        this.house = house;
    }

    public BigInteger getUserid() {
        return userid;
    }

    public void setUserid(BigInteger userid) {
        this.userid = userid;
    }

    public BigInteger getHouseid() {
        return houseid;
    }

    public void setHouseid(BigInteger houseid) {
        this.houseid = houseid;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
