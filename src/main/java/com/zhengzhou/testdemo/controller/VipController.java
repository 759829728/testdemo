package com.zhengzhou.testdemo.controller;
import com.zhengzhou.testdemo.domain.Vip;
import com.zhengzhou.testdemo.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 会员控制器
 **/
@Controller
public class VipController {

    /**
     * VipService注入
      */
    @Autowired
    private VipService vipService;

    /**
     * 对会员表数据的添加
     * @param vip_name 会员姓名
     * @param vip_phone 会员电话
     * @param vip_years_working 会员工作年限
     * @return  插入成功或插入失败
     */
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

    /**
     * 对会员表数据的删除
     * @param vip_id 会员id
     * @return 删除成功或删除失败
     */
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

    /**
     * 对会员表数据的修改
     * @param vip_id 会员id
     * @param vip_name 会员姓名
     * @param vip_phone 会员电话
     * @param vip_years_working 会员工作年限
     * @return 修改成功或修改失败
     */
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
