package com.zhengzhou.testdemo.service;

import com.zhengzhou.testdemo.Vo.VipResumeVo;
import com.zhengzhou.testdemo.domain.Position;

import java.util.List;
import java.util.Map;

public interface PositionService {


    List<VipResumeVo> selectByPositionandCompany(Map<String, Object> map);

    int insertPosition(Position position);

    int deletePosition(int position_id);

    int updatePosition(Position position);

    List<Position> selectPosition(Map<Object, Object> map);

    Integer selectNumbers(Integer position_id);
}
