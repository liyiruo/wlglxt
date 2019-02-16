package com.wlglxt.bean;

import java.util.Date;

/**
 * Created by admin on 2019/2/16.
 */
public class Iaccount {
    private int id;
    private String account;
    private String secretkey;
    private String type;
    private Date joindate;
    private String jointime;
    private String state;

    public Iaccount() {
    }

    public Iaccount(int id, String account, String secretkey, String type, Date joindate, String jointime, String state) {
        this.id = id;
        this.account = account;
        this.secretkey = secretkey;
        this.type = type;
        this.joindate = joindate;
        this.jointime = jointime;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getSecretkey() {
        return secretkey;
    }

    public void setSecretkey(String secretkey) {
        this.secretkey = secretkey;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    public String getJointime() {
        return jointime;
    }

    public void setJointime(String jointime) {
        this.jointime = jointime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Iaccount{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", secretkey='" + secretkey + '\'' +
                ", type='" + type + '\'' +
                ", joindate=" + joindate +
                ", jointime='" + jointime + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
