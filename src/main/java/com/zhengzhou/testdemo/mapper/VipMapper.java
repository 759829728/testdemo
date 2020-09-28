package com.zhengzhou.testdemo.mapper;

import com.zhengzhou.testdemo.domain.Vip;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VipMapper {

    int insertVip(Vip vip);
    int deleteVip(int vip_id);
    int updateVip(Vip vip);
}
