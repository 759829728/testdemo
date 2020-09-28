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

/**
 * 职位表控制器
 */
@Controller
public class PositionController {

    /**
     * PositionService注入
     */
    @Autowired
    private PositionService positionService;

    /**
     * 对职位表数据的插入
     * @param position_name 职位名称
     * @param company_id 公司id
     * @param position_mon_salary 职位月薪范围
     * @param position_company_nature 公司性质
     * @param position_years_working 工作年限
     * @param position_education_background 学历要求
     * @param position_scale_company 公司规模
     * @param position_recruiting_numbers 招聘人数
     * @param position_release_date  发布日期
     * @return 插入成功或插入失败
     * @throws ParseException 时间格式错误
     */
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

    /**
     * 对职位表数据的删除
     * @param position_id 职位id
     * @return 删除成功或删除失败
     */
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

    /**
     * 对职位表数据的修改
     * @param position_id 职位id
     * @param position_name 职位名称
     * @param company_id 公司id
     * @param position_mon_salary 职位月薪范围
     * @param position_company_nature 公司性质
     * @param position_years_working 工作年限
     * @param position_education_background 学历要求
     * @param position_scale_company 公司规模
     * @param position_recruiting_numbers 招聘人数
     * @param position_release_date  发布日期
     * @return 修改成功或修改失败
     */
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

    /**
     * 根据公司名称或职位名称或薪资范围或学历要求搜索查看职位信息，并可按多个条件进行搜索
     * @param position_name 职位名称
     * @param company_name 公司名称
     * @param position_mon_salary 薪资范围
     * @param position_education_background 学历要求
     * @param pageNumber 页数
     * @param pageSize 每页展示记录数
     * @return 返回职位信息集合对象
     */
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

    /**
     * 根据公司名称和职位名称查询会员信和简历信息
     * @param position_name 职位名称
     * @param company_name 公司名称
     * @param pageNumber 页数
     * @param pageSize 每页展示数据
     * @return 返回VipResumeVo对象
     */
    @ResponseBody
    @PostMapping(value = "/position/selectByPositionandCompany")
    public List<VipResumeVo> selectByPositionandCompany
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
