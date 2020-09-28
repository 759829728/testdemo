package com.zhengzhou.testdemo.controller;

import com.zhengzhou.testdemo.Vo.VipResumeVo;
import com.zhengzhou.testdemo.domain.Position;
import com.zhengzhou.testdemo.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PositionController {

    @Autowired
    private PositionService positionService;

    @ResponseBody
    @PostMapping("/position/insertPosition")
    public String insert(
            @RequestParam(value = "position_name",required = false) String position_name,
            @RequestParam(value = "company_id",required = false) Integer company_id,
            @RequestParam(value = "position_mon_salary",required = false) String position_mon_salary,
            @RequestParam(value = "position_company_nature",required = false) String position_company_nature,
            @RequestParam(value = "position_years_working",required = false) Integer position_years_working,
            @RequestParam(value = "position_education_background",required = false) String position_education_background,
            @RequestParam(value = "position_scale_company",required = false) String position_scale_company,
            @RequestParam(value = "position_recruiting_numbers",required = false) Integer position_recruiting_numbers,
            @RequestParam(value = "position_release_date",required = false) String position_release_date
                        ) throws ParseException {
        Position position = new Position();
        position.setCompany_id(company_id);
        position.setPosition_company_nature(position_company_nature);
        position.setPosition_education_background(position_education_background);
        position.setPosition_mon_salary(position_mon_salary);
        position.setPosition_name(position_name);
        position.setPosition_years_working(position_years_working);
        position.setPosition_scale_company(position_scale_company);
        position.setPosition_recruiting_numbers(position_recruiting_numbers);
        if(position_release_date != null){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(position_release_date);
            position.setPosition_release_date(date);
        }
        int result = positionService.insertPosition(position);
        if(result > 0){
            return "插入成功";
        }else {
            return "插入失败";
        }
    }

    //删除
    @ResponseBody
    @PostMapping("/position/deletePosition")
    public String deletePosition(@RequestParam(value = "position_id") int position_id){
        int result = positionService.deletePosition(position_id);
        if(result > 0){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

    //修改
    @ResponseBody
    @PostMapping(value = "/position/updatePosition")
    public String updateResume(@RequestParam(value = "position_name",required = false) String position_name,
                               @RequestParam(value = "company_id",required = false) Integer company_id,
                               @RequestParam(value = "position_mon_salary",required = false) String position_mon_salary,
                               @RequestParam(value = "position_company_nature",required = false) String position_company_nature,
                               @RequestParam(value = "position_years_working",required = false) Integer position_years_working,
                               @RequestParam(value = "position_education_background",required = false) String position_education_background,
                               @RequestParam(value = "position_scale_company",required = false) String position_scale_company,
                               @RequestParam(value = "position_recruiting_numbers",required = false) Integer position_recruiting_numbers,
                               @RequestParam(value = "position_release_date",required = false) String position_release_date,
                               @RequestParam(value = "position_id",required = false) Integer position_id
                                ) throws ParseException {
        Position position = new Position();
        position.setCompany_id(company_id);
        position.setPosition_company_nature(position_company_nature);
        position.setPosition_education_background(position_education_background);
        position.setPosition_mon_salary(position_mon_salary);
        position.setPosition_name(position_name);
        position.setPosition_years_working(position_years_working);
        position.setPosition_scale_company(position_scale_company);
        position.setPosition_recruiting_numbers(position_recruiting_numbers);
        position.setPosition_id(position_id);
        if(position_release_date != null){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(position_release_date);
            position.setPosition_release_date(date);
        }
        int result = positionService.updatePosition(position);
        if (result > 0) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    //根据公司名称或职位名称或薪资范围或学历要求搜索查看职位信息，并可按多个条件进行搜索。
    @ResponseBody
    @PostMapping(value = "/position/selectPosition")
    public List<Position> selectPosition(@RequestParam(value = "position_name",required = false) String position_name,
                               @RequestParam(value = "company_name",required = false) String company_name,
                               @RequestParam(value = "position_mon_salary",required = false) String position_mon_salary,
                               @RequestParam(value = "position_education_background",required = false) String position_education_background,
                               @RequestParam(value = "pageNumber",required = false) Integer pageNumber,
                               @RequestParam(value = "pageSize",required = false) Integer pageSize
    ){
        Map<Object,Object> map = new HashMap<>();
        map.put("position_name",position_name);
        map.put("company_name",company_name);
        map.put("position_mon_salary",position_mon_salary);
        map.put("position_education_background",position_education_background);
        pageNumber=(pageNumber-1)*pageSize;
        map.put("pageNumber",pageNumber);
        map.put("pageSize",pageSize);
        List<Position> positionList = positionService.selectPosition(map);
        return positionList;
    }


    //根据公司名称和职位名称查询会员信和简历信息。
    @ResponseBody
    @PostMapping(value = "/position/selectByPositionandCompany")
    public List<VipResumeVo> selectPosition
                                        (@RequestParam(value = "position_name",required = false) String position_name,
                                         @RequestParam(value = "company_name",required = false) String company_name,
                                         @RequestParam(value = "pageNumber",required = false) Integer pageNumber,
                                         @RequestParam(value = "pageSize",required = false) Integer pageSize
                                        ){
            Map<String,Object> map = new HashMap<>();
            map.put("position_name",position_name);
            map.put("company_name",company_name);
            pageNumber=(pageNumber-1)*pageSize;
            map.put("pageNumber",pageNumber);
            map.put("pageSize",pageSize);
            List<VipResumeVo> resultMap = positionService.selectByPositionandCompany(map);
            return resultMap ;
    }




}
