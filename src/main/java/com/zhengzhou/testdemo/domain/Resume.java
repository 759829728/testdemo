package com.zhengzhou.testdemo.domain;

import org.springframework.stereotype.Component;

/**
 * Resume Bean
 **/
@Component
public class Resume {
    //简历id
    private int resume_id;
    //vipid
    private int vip_id;
    //求职意向
    private String resume_job_intention;
    //期望薪资
    private double resume_expected_salary;
    //是否在职
    private String resume_whether_office;
    //自我评价
    private String resume_self_evaluation;


    @Override
    public String toString() {
        return "Resume{" +
                "resume_id=" + resume_id +
                ", vip_id=" + vip_id +
                ", resume_job_intention='" + resume_job_intention + '\'' +
                ", resume_expected_salary=" + resume_expected_salary +
                ", resume_whether_office='" + resume_whether_office + '\'' +
                ", resume_self_evaluation='" + resume_self_evaluation + '\'' +
                '}';
    }

    public int getResume_id() {
        return resume_id;
    }

    public void setResume_id(int resume_id) {
        this.resume_id = resume_id;
    }

    public int getVip_id() {
        return vip_id;
    }

    public void setVip_id(int vip_id) {
        this.vip_id = vip_id;
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
}
