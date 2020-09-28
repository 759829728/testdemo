package com.zhengzhou.testdemo.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * ：高英杰
 * ：2020-9-24
 **/
@Component
public class Company {
    //公司id
    private int company_id;
    //公司名称
    private String company_name;
    //公司规模
    private String company_scale_company;
    //公司地址
    private String company_address;
    //公司行业
    private String company_industry;

    @Override
    public String toString() {
        return "Company{" +
                "company_id=" + company_id +
                ", company_name='" + company_name + '\'' +
                ", company_scale_company='" + company_scale_company + '\'' +
                ", company_address='" + company_address + '\'' +
                ", company_industry='" + company_industry + '\'' +
                '}';
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_scale_company() {
        return company_scale_company;
    }

    public void setCompany_scale_company(String company_scale_company) {
        this.company_scale_company = company_scale_company;
    }

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }

    public String getCompany_industry() {
        return company_industry;
    }

    public void setCompany_industry(String company_industry) {
        this.company_industry = company_industry;
    }
}
