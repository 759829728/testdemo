package com.zhengzhou.testdemo.domain;

import org.springframework.stereotype.Component;

/**
 * ：高英杰
 * ：2020-9-24
 **/
@Component
public class Vip {
    //vipid
    private int vip_id;
    //vip姓名
    private String vip_name;
    //vip电话
    private String vip_phone;
    //vip工作年限
    private Integer vip_years_working;

    @Override
    public String toString() {
        return "Vip{" +
                "vip_id=" + vip_id +
                ", vip_name='" + vip_name + '\'' +
                ", vip_phone='" + vip_phone + '\'' +
                ", vip_years_working=" + vip_years_working +
                '}';
    }

    public int getVip_id() {
        return vip_id;
    }

    public void setVip_id(int vip_id) {
        this.vip_id = vip_id;
    }

    public String getVip_name() {
        return vip_name;
    }

    public void setVip_name(String vip_name) {
        this.vip_name = vip_name;
    }

    public String getVip_phone() {
        return vip_phone;
    }

    public void setVip_phone(String vip_phone) {
        this.vip_phone = vip_phone;
    }

    public Integer getVip_years_working() {
        return vip_years_working;
    }

    public void setVip_years_working(Integer vip_years_working) {
        this.vip_years_working = vip_years_working;
    }
}
