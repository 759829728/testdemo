package com.zhengzhou.testdemo.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.util.Date;

/**
 * Position Bean
 **/
@Component
public class Position {
    //职位id
    private Integer position_id;
    //职位名称
    private String position_name;
    //公司id
    private Integer company_id;
    //职位月薪范围
    private String position_mon_salary;
    //公司性质
    private String position_company_nature;
    //工作年限
    private Integer position_years_working;
    //学历要求
    private String position_education_background;
    //公司规模
    private String position_scale_company;
    //招聘人数
    private Integer position_recruiting_numbers;
    //发布日期
    private Date position_release_date;

    @Override
    public String toString() {
        return "Position{" +
                "position_id=" + position_id +
                ", position_name='" + position_name + '\'' +
                ", company_id=" + company_id +
                ", position_mon_salary='" + position_mon_salary + '\'' +
                ", position_company_nature='" + position_company_nature + '\'' +
                ", position_years_working=" + position_years_working +
                ", position_education_background='" + position_education_background + '\'' +
                ", position_scale_company='" + position_scale_company + '\'' +
                ", position_recruiting_numbers=" + position_recruiting_numbers +
                ", position_release_date=" + position_release_date +
                '}';
    }

    public Integer getPosition_id() {
        return position_id;
    }

    public void setPosition_id(Integer position_id) {
        this.position_id = position_id;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }

    public String getPosition_mon_salary() {
        return position_mon_salary;
    }

    public void setPosition_mon_salary(String position_mon_salary) {
        this.position_mon_salary = position_mon_salary;
    }

    public String getPosition_company_nature() {
        return position_company_nature;
    }

    public void setPosition_company_nature(String position_company_nature) {
        this.position_company_nature = position_company_nature;
    }

    public Integer getPosition_years_working() {
        return position_years_working;
    }

    public void setPosition_years_working(Integer position_years_working) {
        this.position_years_working = position_years_working;
    }

    public String getPosition_education_background() {
        return position_education_background;
    }

    public void setPosition_education_background(String position_education_background) {
        this.position_education_background = position_education_background;
    }

    public String getPosition_scale_company() {
        return position_scale_company;
    }

    public void setPosition_scale_company(String position_scale_company) {
        this.position_scale_company = position_scale_company;
    }

    public Integer getPosition_recruiting_numbers() {
        return position_recruiting_numbers;
    }

    public void setPosition_recruiting_numbers(Integer position_recruiting_numbers) {
        this.position_recruiting_numbers = position_recruiting_numbers;
    }

    public Date getPosition_release_date() {
        return position_release_date;
    }

    public void setPosition_release_date(Date position_release_date) {
        this.position_release_date = position_release_date;
    }
}
