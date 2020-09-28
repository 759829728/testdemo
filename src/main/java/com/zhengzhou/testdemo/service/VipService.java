package com.zhengzhou.testdemo.service;
import com.zhengzhou.testdemo.domain.Vip;

public interface VipService {

     /**
      * 对会员表数据的添加
      * @param vip 会员对象
      * @return 返回插入记录的条数
      */
     int insertVip(Vip vip);

     /**
      * 对会员表数据的删除
      * @param vip 会员对象
      * @return 返回删除记录的条数
      */
     int deleteVip(Vip vip);

     /**
      * 对会员表数据的修改
      * @param vip 会员对象
      * @return 返回修改记录的条数
      */
     int updateVip(Vip vip);
}
