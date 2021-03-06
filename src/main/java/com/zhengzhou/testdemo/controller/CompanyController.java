package com.zhengzhou.testdemo.controller;
import com.zhengzhou.testdemo.domain.Company;
import com.zhengzhou.testdemo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 公司控制器
 */
@Controller
public class CompanyController {


    /**
     * CompanyService注入
     */
    @Autowired
    private CompanyService companyService;

    /**
     * 对公司表的数据插入
     * @param company_name 公司姓名
     * @param company_scale_company 公司规模
     * @param company_address 公司地址
     * @param company_industry  公司行业
     * @return  插入成功或插入失败
     */
    @ResponseBody
    @PostMapping("/company/insertCompany")
    public String insert(
                      @RequestParam(value = "company_name",required = false) String company_name,
                      @RequestParam(value = "company_scale_company",required = false) String company_scale_company,
                      @RequestParam(value = "company_address",required = false) String company_address,
                      @RequestParam(value = "company_industry",required = false) String company_industry
                        ){
        Company company = new Company();
        company.setCompany_name(company_name);
        company.setCompany_address(company_address);
        company.setCompany_scale_company(company_scale_company);
        company.setCompany_industry(company_industry);
        int result = companyService.insertCompany(company);
        if(result > 0){
            return "插入成功";
        }else {
            return "插入失败";
        }
    }

    /**
     * 对公司表的数据删除
     * @param company_id  公司id
     * @return 删除成功或删除失败
     */
    @ResponseBody
    @PostMapping("/company/deleteCompany")
    public String deleteVip(@RequestParam(value = "company_id") int company_id){
        Company company = new Company();
        company.setCompany_id(company_id);
        int result = companyService.deleteCompany(company);
        if(result > 0){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

    /**
     * 对公司表的数据修改
     * @param company_id  公司id
     * @param company_name  公司姓名
     * @param company_scale_company 公司规模
     * @param company_address  公司地址
     * @param company_industry 公司行业
     * @return 修改成功或修改失败
     */
    @ResponseBody
    @PostMapping(value = "/company/updateCompany")
    public String updateVip(@RequestParam(value = "company_id") int company_id,
                            @RequestParam(value = "company_name",required = false) String company_name,
                            @RequestParam(value = "company_scale_company",required = false) String company_scale_company,
                            @RequestParam(value = "company_address",required = false) String company_address,
                            @RequestParam(value = "company_industry",required = false) String company_industry
                            ){
        Company company = new Company();
        company.setCompany_id(company_id);
        company.setCompany_name(company_name);
        company.setCompany_address(company_address);
        company.setCompany_scale_company(company_scale_company);
        company.setCompany_industry(company_industry);
        int result = companyService.updateCompany(company);
        if(result > 0){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }






}
