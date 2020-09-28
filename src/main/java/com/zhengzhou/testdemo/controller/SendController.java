package com.zhengzhou.testdemo.controller;
import com.zhengzhou.testdemo.domain.Send;
import com.zhengzhou.testdemo.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Send控制器
 */

@Controller
public class SendController {

    /**
     * SendService注入
     */
    @Autowired
    private SendService sendService;

    /**
     * 投递简历功能，并且校验简历是否重复,如果招聘人数已满，提示招聘人数已满
     * @param vip_vid 会员id
     * @param resume_id  简历id
     * @param position_id 职位id
     * @param send_time 投递时间
     * @param send_interview_result 投递结果
     * @return  1.插入成功 2.职位招聘数已满 3.简历重复
     * @throws ParseException 时间格式出错
     */
    @ResponseBody
    @PostMapping("/send/insertSend")
    public String insert(
            @RequestParam(value = "vip_vid") Integer vip_vid,
            @RequestParam(value = "resume_id") Integer resume_id,
            @RequestParam(value = "position_id") Integer position_id,
            @RequestParam(value = "send_time") String send_time,
            @RequestParam(value = "send_interview_result") Integer send_interview_result
    ) throws ParseException {
        Send send = new Send();
        send.setVip_id(vip_vid);
        send.setPosition_id(position_id);
        send.setResume_id(resume_id);
        if(send_time != null){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(send_time);
            send.setSend_time(date);
        }
        send.setSend_interview_result(send_interview_result);
        int result  =   sendService.insertSend(send);
            if(result == 1){
                return "插入成功";
            }else if (result == 2) {
                return "招聘人数已满";
            }else {
                return "简历重复";
        }
    }

    /**
     * 修改面试结果
     * @param send_id 投递id
     * @param send_interview_result 投递面试结果
     * @return 修改成功或修改失败
     */
    @ResponseBody
    @PostMapping("/send/updateInterviewResult")
    public String updateInterviewResult(
            @RequestParam(value = "send_id") Integer send_id,
            @RequestParam(value = "send_interview_result") Integer send_interview_result
                                        ){
        Send send = new Send();
        send.setSend_id(send_id);
        send.setSend_interview_result(send_interview_result);
       int result =  sendService.updateInterviewResult(send);
        if(result >0 ){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }









}
