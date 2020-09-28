package com.zhengzhou.testdemo.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.util.Date;

/**
 * Send Bean
 **/
@Component
public class Send {
    //投递id
    private Integer send_id;
    //vipid
    private Integer vip_id;
    //简历id
    private Integer resume_id;
    //职位id
    private Integer position_id;
    //投递时间
    private Date send_time;
    // 面试结果  0，未面试，1，未通过，2，已通过
    private Integer send_interview_result;

    @Override
    public String toString() {
        return "Send{" +
                "send_id=" + send_id +
                ", vip_id=" + vip_id +
                ", resume_id=" + resume_id +
                ", position_id=" + position_id +
                ", send_time=" + send_time +
                ", send_interview_result=" + send_interview_result +
                '}';
    }

    public Integer getSend_id() {
        return send_id;
    }

    public void setSend_id(Integer send_id) {
        this.send_id = send_id;
    }

    public Integer getVip_id() {
        return vip_id;
    }

    public void setVip_id(Integer vip_id) {
        this.vip_id = vip_id;
    }

    public Integer getResume_id() {
        return resume_id;
    }

    public void setResume_id(Integer resume_id) {
        this.resume_id = resume_id;
    }

    public Integer getPosition_id() {
        return position_id;
    }

    public void setPosition_id(Integer position_id) {
        this.position_id = position_id;
    }

    public Date getSend_time() {
        return send_time;
    }

    public void setSend_time(Date send_time) {
        this.send_time = send_time;
    }

    public Integer getSend_interview_result() {
        return send_interview_result;
    }

    public void setSend_interview_result(Integer send_interview_result) {
        this.send_interview_result = send_interview_result;
    }
}
