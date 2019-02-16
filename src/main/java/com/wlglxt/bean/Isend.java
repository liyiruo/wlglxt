package com.wlglxt.bean;

import java.util.Date;

/**
 * Created by admin on 2019/2/16.
 */
public class Isend {

    private int id;
    private Date senddate;
    private String sendtime;
    private String sendmg;

    @Override
    public String toString() {
        return "Isend{" +
                "id=" + id +
                ", senddate=" + senddate +
                ", sendtime='" + sendtime + '\'' +
                ", sendmg='" + sendmg + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    public String getSendtime() {
        return sendtime;
    }

    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }

    public String getSendmg() {
        return sendmg;
    }

    public void setSendmg(String sendmg) {
        this.sendmg = sendmg;
    }

    public Isend(int id, Date senddate, String sendtime, String sendmg) {

        this.id = id;
        this.senddate = senddate;
        this.sendtime = sendtime;
        this.sendmg = sendmg;
    }

    public Isend() {

    }
}
