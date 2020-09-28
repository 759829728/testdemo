package com.zhengzhou.testdemo.mapper;

import com.zhengzhou.testdemo.domain.Company;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyMapper {

    /**
     * 对公司表的数据插入
     * @param company 公司对象
     * @return  返回插入记录条数
     */
    int insertCompany(Company company);

    /**
     * 对公司表的数据删除
     * @param company_id  公司id
     * @return 返回删除记录条数
     */
    int deleteCompany(int company_id);

    /**
     * 对公司表的数据修改
     * @param company  公司对象
     * @return  返回修改记录条数
     */
    int updateCompany(Company company);
}
