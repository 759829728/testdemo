package com.zhengzhou.testdemo.service;
import com.zhengzhou.testdemo.domain.Company;

public interface CompanyService {

    /**
     * 对公司表的数据插入
     * @param company 公司对象
     * @return  返回插入记录条数
     */
    int insertCompany(Company company);

    /**
     * 对公司表的数据删除
     * @param company  公司对象
     * @return 返回删除记录条数
     */
    int deleteCompany(Company company);

    /**
     * 对c公司表的数据修改
     * @param company  公司对象
     * @return  返回修改记录条数
     */
    int updateCompany(Company company);
}
