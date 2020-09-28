package com.zhengzhou.testdemo.mapper;

import com.zhengzhou.testdemo.domain.Vip;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VipMapper {

    /**
     * 对会员表数据的插入
     * @param vip 会员对象
     * @return 返回插入记录条数
     */
    int insertVip(Vip vip);

    /**
     * 对会员表数据的删除
     * @param vip_id 会员id
     * @return 返回删除记录条数
     */
    int deleteVip(int vip_id);

    /**
     * 对会员表数据的修改
     * @param vip 会员对象
     * @return 返回修改记录条数
     */
    int updateVip(Vip vip);
}
