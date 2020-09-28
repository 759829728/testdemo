package com.zhengzhou.testdemo.controller;

import com.zhengzhou.testdemo.domain.Resume;
import com.zhengzhou.testdemo.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 简历控制器
 */
@Controller
public class ResumeController {

    /**
     * ResumeService注入
     */
    @Autowired
    private ResumeService resumeService;

    /**
     * 对简历表数据的添加
     * @param vip_id 会员id
     * @param resume_job_intention 求职意向
     * @param resume_expected_salary 期望薪资
     * @param resume_whether_office 是否在职
     * @param resume_self_evaluation 自我评价
     * @return 插入成功或插入失败
     */
    @ResponseBody
    @PostMapping("/resume/insertResume")
    public String insert(
                      @RequestParam(value = "vip_id",required = false) Integer vip_id,
                      @RequestParam(value = "resume_job_intention",required = false) String resume_job_intention,
                      @RequestParam(value = "resume_expected_salary",required = false) double resume_expected_salary,
                      @RequestParam(value = "resume_whether_office",required = false) String resume_whether_office,
                      @RequestParam(value = "resume_self_evaluation",required = false) String resume_self_evaluation
                      ){
        Resume resume = new Resume();
        resume.setVip_id(vip_id);
        resume.setResume_job_intention(resume_job_intention);
        resume.setResume_expected_salary(resume_expected_salary);
        resume.setResume_whether_office(resume_whether_office);
        resume.setResume_self_evaluation(resume_self_evaluation);
        int result = resumeService.insertResume(resume);
        if(result > 0){
            return "插入成功";
        }else {
            return "插入失败";
        }
    }

    /**
     * 对简历表数据的删除
     * @param resume_id 简历id
     * @return 删除成功或删除失败
     */
    @ResponseBody
    @PostMapping("/resume/deleteResume")
    public String deleteResume(@RequestParam(value = "resume_id") int resume_id){
        Resume resume = new Resume();
        resume.setResume_id(resume_id);
        int result = resumeService.deleteResume(resume);
        if(result > 0){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

    /**
     * 对简历表数据的修改
     * @param resume_id 简历id
     * @param vip_id 会员id
     * @param resume_job_intention 求职意向
     * @param resume_expected_salary 期望薪资
     * @param resume_whether_office 是否在职
     * @param resume_self_evaluation 自我评价
     * @return 修改成功或修改失败
     */
    @ResponseBody
    @PostMapping(value = "/resume/updateResume")
    public String updateResume(@RequestParam(value = "resume_id") int resume_id,
                               @RequestParam(value = "vip_id",required = false) Integer vip_id,
                               @RequestParam(value = "resume_job_intention",required = false) String resume_job_intention,
                               @RequestParam(value = "resume_expected_salary",required = false) Double resume_expected_salary,
                               @RequestParam(value = "resume_whether_office",required = false) String resume_whether_office,
                               @RequestParam(value = "resume_self_evaluation",required = false) String resume_self_evaluation
                                ){
        Resume resume = new Resume();
        resume.setResume_id(resume_id);
        resume.setVip_id(vip_id);
        resume.setResume_job_intention(resume_job_intention);
        resume.setResume_expected_salary(resume_expected_salary);
        resume.setResume_whether_office(resume_whether_office);
        resume.setResume_self_evaluation(resume_self_evaluation);
        int result = resumeService.updateResume(resume);
        if (result > 0) {
            return "修改成功";
        } else {
            return "修改失败";
        }


    }

}
