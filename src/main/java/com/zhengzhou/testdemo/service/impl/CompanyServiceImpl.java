package com.zhengzhou.testdemo.service.impl;
import com.zhengzhou.testdemo.domain.Company;
import com.zhengzhou.testdemo.mapper.CompanyMapper;
import com.zhengzhou.testdemo.service.CompanyService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;


/**
 * 公司业务层
 **/
@Service
public class CompanyServiceImpl implements CompanyService {

    /**
     * 注入companyMapper
     */
    @Resource
    private CompanyMapper companyMapper;

    /**
     * 对公司表的数据插入
     * @param company 公司对象
     * @return 返回插入记录条数
     */
    @Override
    public int insertCompany(Company company) {
        int  result = companyMapper.insertCompany(company);
        return result;
    }

    /**
     * 对公司表的数据删除
     * @param company  公司对象
     * @return 返回删除记录条数
     */
    @Override
    public int deleteCompany(Company company) {
         int result = companyMapper.deleteCompany(company.getCompany_id());
        return result;
    }

    /**
     * 对公司表的数据修改
     * @param company  公司对象
     * @return  返回修改记录条数
     */
    @Override
    public int updateCompany(Company company) {
        int result =   companyMapper.updateCompany(company);
        return result;
    }
}
