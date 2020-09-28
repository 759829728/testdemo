package com.zhengzhou.testdemo.service.impl;

import com.zhengzhou.testdemo.domain.Company;
import com.zhengzhou.testdemo.mapper.CompanyMapper;
import com.zhengzhou.testdemo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * ：高英杰
 * ：2020-9-24
 **/
@Service
public class CompanyServiceImpl implements CompanyService {

    @Resource
    private CompanyMapper companyMapper;

    @Override
    public int insertCompany(Company company) {
        int  result = companyMapper.insertCompany(company);
        return result;
    }

    @Override
    public int deleteCompany(Company company) {
         int result =   companyMapper.deleteCompany(company.getCompany_id());
        return result;
    }

    @Override
    public int updateCompany(Company company) {
        int result =   companyMapper.updateCompany(company);
        return result;
    }
}
