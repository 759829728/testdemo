package com.zhengzhou.testdemo.controller;

import com.zhengzhou.testdemo.domain.Vip;
import com.zhengzhou.testdemo.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * ：高英杰
 * ：2020-9-24
 **/
@Controller
public class VipController {

    @Autowired
    private VipService vipService;

    //添加
    @ResponseBody
    @PostMapping("/vip/insertVip")
    public  String insert(@RequestParam(value = "vip_name",required = false) String vip_name,
                      @RequestParam(value = "vip_phone",required = false) String vip_phone,
                      @RequestParam(value = "vip_years_working",required = false) Integer vip_years_working
                      ){

        Vip vip1 = new Vip();
        vip1.setVip_name(vip_name);
        vip1.setVip_phone(vip_phone);
        vip1.setVip_years_working(vip_years_working);
        int result = vipService.insertVip(vip1);
        if(result > 0){
            return "插入成功";
        }else {
            return "插入失败";
        }
    }

    //删除
    @ResponseBody
    @PostMapping("/vip/deleteVip")
    public String deleteVip(@RequestParam(value = "vip_id") int vip_id){
        Vip vip = new Vip();
        vip.setVip_id(vip_id);
        int result = vipService.deleteVip(vip);
        if(result > 0){
            return "删除成功";
        }else {
           return "删除失败";
        }
    }

    //修改
    @ResponseBody
    @PostMapping(value = "/vip/updateVip")
    public String updateVip(@RequestParam(value = "vip_id") int vip_id,
                            @RequestParam(value = "vip_name",required = false) String vip_name,
                            @RequestParam(value = "vip_phone",required = false) String vip_phone,
                            @RequestParam(value = "vip_years_working",required = false) Integer vip_years_working){
        Vip vip = new Vip();
        vip.setVip_id(vip_id);
        vip.setVip_name(vip_name);
        vip.setVip_phone(vip_phone);
        vip.setVip_years_working(vip_years_working);
        int result = vipService.updateVip(vip);
        if(result > 0){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }






}
