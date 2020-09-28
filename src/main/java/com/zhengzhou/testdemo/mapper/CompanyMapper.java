package com.zhengzhou.testdemo.mapper;

import com.zhengzhou.testdemo.domain.Company;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyMapper {

    int insertCompany(Company company);

    int deleteCompany(int company_id);

    int updateCompany(Company company);
}
