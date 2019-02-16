package com.wlglxt.bean;

import com.sun.scenario.effect.impl.prism.PrImage;

import java.util.Date;

/**
 * Created by admin on 2019/2/16.
 */
public class Postaddress {

    private int id;
    private String name;
    private String phone;
    private String address;
    private Date recorddate;
    private String recordtime;

    @Override
    public String toString() {
        return "Postaddress{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", recorddate=" + recorddate +
                ", recordtime='" + recordtime + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }

    public String getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(String recordtime) {
        this.recordtime = recordtime;
    }

    public Postaddress(int id, String name, String phone, String address, Date recorddate, String recordtime) {

        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.recorddate = recorddate;
        this.recordtime = recordtime;
    }

    public Postaddress() {

    }
}
