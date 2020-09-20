package com.mook.house.house.entity;

import java.util.Date;

/**
 * LUOPEILONG
 * 2020/9/19
 **/
public class Product {
    private int  id;
    private String cpmc;
    private String hh;
    private String txm;
    private String lb;
    private String style;
    private String sfdz;
    private String syrq;
    private Date jgrq;
    private String cpbt;
    private String bz;
    private String tplj;
    private Date createTime;
    private String createBy;
    private Date updateTime;
    private String updateBy;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getCpmc(){
        return cpmc;
    }
    public void setCpmc(String cpmc){
        this.cpmc = cpmc;
    }

    public String getHh(){
        return hh;
    }
    public void setHh(String hh){
        this.hh = hh;
    }

    public  String getTxm(){
        return txm;
    }
    public void setTxm(String txm){
        this.txm = txm;
    }

    public String getLb(){
        return lb;
    }
    public void setLb(String lb){
        this.lb = lb;
    }

    public String getStyle(){
        return style;
    }
    public void setStyle(String style){
        this.style = style;
    }

    public String getSfdz(){
        return sfdz;
    }
    public void setSfdz(String sfdz){
        this.sfdz = sfdz;
    }

    public Date getJgrq(){
        return jgrq;
    }
    public void setJgrq(Date jgrq){
        this.jgrq = jgrq;
    }

    public String getCpbt(){
        return cpbt;
    }
    public void setCpbt(String cpbt){
        this.cpbt = cpbt;
    }

    public String getBz(){
        return bz;
    }
    public void setBz(String bz){
        this.bz = bz;
    }

    public String getTplj(){
        return tplj;
    }
    public void setTplj(String tplj){
        this.tplj = tplj;
    }

    public Date getCreateTime(){
        return createTime;
    }
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    public String getCreateBy(){
        return createBy;
    }
    public void setCreateBy(){
        this.createBy = createBy;
    }

    public Date getUpdateTime(){
        return updateTime;
    }
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    }

    public String getUpdateBy(){
        return updateBy;
    }
    public void setUpdateBy(String updateBy){
        this.updateBy = updateBy;
    }
}
