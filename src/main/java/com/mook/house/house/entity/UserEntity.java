package com.mook.house.house.entity;

import java.sql.Date;
import java.util.Objects;

public class UserEntity {
    private long id;
    private String name;
    private String phone;
    private String passwd;
    private Date create_time;
    private String enable;
    private String department_id;
    private String is_admin;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    public String getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(String is_admin) {
        this.is_admin = is_admin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(passwd, that.passwd) &&
                Objects.equals(create_time, that.create_time) &&
                Objects.equals(enable, that.enable) &&
                Objects.equals(department_id, that.department_id) &&
                Objects.equals(is_admin, that.is_admin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone, passwd, create_time, enable, department_id, is_admin);
    }
}
