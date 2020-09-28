package com.zhengzhou.testdemo.service;

import com.zhengzhou.testdemo.domain.Company;
import com.zhengzhou.testdemo.domain.Vip;

public interface CompanyService {
    int insertCompany(Company company);

    int deleteCompany(Company company);

    int updateCompany(Company company);
}
