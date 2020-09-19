package domain;

import java.util.Date;

public class Product {
    private Integer id;

    private String cpm;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpm() {
        return cpm;
    }

    public void setCpm(String cpm) {
        this.cpm = cpm == null ? null : cpm.trim();
    }

    public String getHh() {
        return hh;
    }

    public void setHh(String hh) {
        this.hh = hh == null ? null : hh.trim();
    }

    public String getTxm() {
        return txm;
    }

    public void setTxm(String txm) {
        this.txm = txm == null ? null : txm.trim();
    }

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb == null ? null : lb.trim();
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public String getSfdz() {
        return sfdz;
    }

    public void setSfdz(String sfdz) {
        this.sfdz = sfdz == null ? null : sfdz.trim();
    }

    public String getSyrq() {
        return syrq;
    }

    public void setSyrq(String syrq) {
        this.syrq = syrq == null ? null : syrq.trim();
    }

    public Date getJgrq() {
        return jgrq;
    }

    public void setJgrq(Date jgrq) {
        this.jgrq = jgrq;
    }

    public String getCpbt() {
        return cpbt;
    }

    public void setCpbt(String cpbt) {
        this.cpbt = cpbt == null ? null : cpbt.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getTplj() {
        return tplj;
    }

    public void setTplj(String tplj) {
        this.tplj = tplj == null ? null : tplj.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }
}