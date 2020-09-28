package com.zhengzhou.testdemo.controller;
import com.zhengzhou.testdemo.domain.Send;
import com.zhengzhou.testdemo.service.PositionService;
import com.zhengzhou.testdemo.service.ResumeService;
import com.zhengzhou.testdemo.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class SendController {

    @Autowired
    private SendService sendService;

    @Autowired
    private ResumeService resumeService;

    @Autowired
    private PositionService positionService;

    //投递简历功能，并且校验简历是否重复,如果招聘人数已满，提示招聘人数已满
    @ResponseBody
    @PostMapping("/send/insertSend")
    public String insert(
            @RequestParam(value = "vip_vid") Integer vip_vid,
            @RequestParam(value = "resume_id") Integer resume_id,
            @RequestParam(value = "position_id") Integer position_id,
            @RequestParam(value = "send_time") String send_time,
            @RequestParam(value = "send_interview_result") Integer send_interview_result
    ) throws ParseException {
        int one = 0;
        Send send = new Send();
        send.setVip_id(vip_vid);
        Integer numbers = positionService.selectNumbers(position_id);
            if(numbers == 0) {
                one = 2;
            }
         if(one == 2){
             return "职位招聘人数已满";
         }
        send.setPosition_id(position_id);
        List<Integer> res  = resumeService.selectId(resume_id);
        for (int id : res ){
            if(resume_id == id){
                one = 1;
                break;
            }
        }
        if(one == 1){
            return "简历重复";
        }else {
            send.setResume_id(resume_id);
            if(send.getResume_id() != null ) {
                if (send_interview_result != null) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    Date date = simpleDateFormat.parse(send_time);
                    send.setSend_time(date);
                }
            }
            send.setSend_interview_result(send_interview_result);
            int result  =   sendService.insertSend(send);
            if(result > 0){
                return "插入成功";
            }else {
                return "插入失败";
            }
        }
    }

    //修改面试结果
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
