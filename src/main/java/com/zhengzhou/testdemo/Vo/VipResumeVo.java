package com.zhengzhou.testdemo.Vo;

import org.springframework.stereotype.Component;

@Component
public class VipResumeVo {
    //简历id
    private Integer resume_id;
    //vipid
    private Integer resume_vip_id;
    //求职意向
    private String resume_job_intention;
    //期望薪资
    private double resume_expected_salary;
    //是否在职
    private String resume_whether_office;
    //自我评价
    private String resume_self_evaluation;
    //vipid
    private Integer vip_id;
    //vip姓名
    private String vip_name;
    //vip电话
    private String vip_phone;
    //vip工作年限
    private Integer vip_years_working;

    @Override
    public String toString() {
        return "VipResume{" +
                "resume_id=" + resume_id +
                ", resume_vip_id=" + resume_vip_id +
                ", resume_job_intention='" + resume_job_intention + '\'' +
                ", resume_expected_salary=" + resume_expected_salary +
                ", resume_whether_office='" + resume_whether_office + '\'' +
                ", resume_self_evaluation='" + resume_self_evaluation + '\'' +
                ", vip_id=" + vip_id +
                ", vip_name='" + vip_name + '\'' +
                ", vip_phone='" + vip_phone + '\'' +
                ", vip_years_working=" + vip_years_working +
                '}';
    }

    public Integer getResume_id() {
        return resume_id;
    }

    public void setResume_id(Integer resume_id) {
        this.resume_id = resume_id;
    }

    public Integer getResume_vip_id() {
        return resume_vip_id;
    }

    public void setResume_vip_id(Integer resume_vip_id) {
        this.resume_vip_id = resume_vip_id;
    }

    public String getResume_job_intention() {
        return resume_job_intention;
    }

    public void setResume_job_intention(String resume_job_intention) {
        this.resume_job_intention = resume_job_intention;
    }

    public double getResume_expected_salary() {
        return resume_expected_salary;
    }

    public void setResume_expected_salary(double resume_expected_salary) {
        this.resume_expected_salary = resume_expected_salary;
    }

    public String getResume_whether_office() {
        return resume_whether_office;
    }

    public void setResume_whether_office(String resume_whether_office) {
        this.resume_whether_office = resume_whether_office;
    }

    public String getResume_self_evaluation() {
        return resume_self_evaluation;
    }

    public void setResume_self_evaluation(String resume_self_evaluation) {
        this.resume_self_evaluation = resume_self_evaluation;
    }

    public Integer getVip_id() {
        return vip_id;
    }

    public void setVip_id(Integer vip_id) {
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
