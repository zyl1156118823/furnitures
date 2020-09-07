package com.mook.house.house.entity;

import java.math.BigInteger;
import java.util.List;

public class User {
    private BigInteger id;
    private String name;
    private String phone;
    private List<HouseuserVo> houseuserVos;

    public User() {
    }

    public User(BigInteger id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public User(BigInteger id, String name, String phone, List<HouseuserVo> houseuserVos) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.houseuserVos = houseuserVos;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<HouseuserVo> getHouseuserVos() {
        return houseuserVos;
    }

    public void setHouseuserVos(List<HouseuserVo> houseuserVos) {
        this.houseuserVos = houseuserVos;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
