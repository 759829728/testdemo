package com.zhengzhou.testdemo.service.impl;
import com.zhengzhou.testdemo.domain.Vip;
import com.zhengzhou.testdemo.mapper.VipMapper;
import com.zhengzhou.testdemo.service.VipService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * 会员业务层
 **/
@Service
public class VipServiceImpl implements VipService {

    /**
     * VipMapper注入
     */
    @Resource
    private VipMapper vipMapper;

    /**
     * 对会员表数据的插入
     * @param vip 会员对象
     * @return 返回插入记录条数
     */
    @Override
    public int insertVip(Vip vip) {
        int result = vipMapper.insertVip(vip);
        return result;
    }

    /**
     * 对会员表数据的删除
     * @param vip 会员对象
     * @return 返回删除记录条数
     */
    @Override
    public int deleteVip(Vip vip) {
        int result =  vipMapper.deleteVip(vip.getVip_id());
        return result;
    }

    /**
     * 对会员表数据的修改
     * @param vip 会员对象
     * @return 返回修改记录条数
     */
    @Override
    public int updateVip(Vip vip) {
        return vipMapper.updateVip(vip);
    }


}
