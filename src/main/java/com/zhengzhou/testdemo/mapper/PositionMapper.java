package com.zhengzhou.testdemo.mapper;

import com.zhengzhou.testdemo.Vo.VipResumeVo;
import com.zhengzhou.testdemo.domain.Position;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PositionMapper {


    int insertPosition(Position position);

    int deletePosition(int position_id);

    int updatePosition(Position position);


    List<Position> selectPosition(Map<Object, Object> map);

    List<VipResumeVo> selectByPositionandCompany(Map<String, Object> map);

    Integer selectNumbers(Integer position_id);
}
