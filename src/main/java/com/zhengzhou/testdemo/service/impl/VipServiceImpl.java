package com.zhengzhou.testdemo.service.impl;

import com.zhengzhou.testdemo.domain.Vip;
import com.zhengzhou.testdemo.mapper.VipMapper;
import com.zhengzhou.testdemo.service.VipService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ：高英杰
 * ：2020-9-24
 **/
@Service
public class VipServiceImpl implements VipService {

    @Resource
    private VipMapper vipMapper;

    @Override
    public int insertVip(Vip vip) {
        int result = vipMapper.insertVip(vip);
        return result;
    }

    @Override
    public int deleteVip(Vip vip) {
        int result =  vipMapper.deleteVip(vip.getVip_id());
        return result;
    }

    @Override
    public int updateVip(Vip vip) {
        return vipMapper.updateVip(vip);
    }


}
