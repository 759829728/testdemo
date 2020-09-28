package com.zhengzhou.testdemo.service.impl;

import com.zhengzhou.testdemo.Vo.VipResumeVo;
import com.zhengzhou.testdemo.domain.Position;
import com.zhengzhou.testdemo.mapper.PositionMapper;
import com.zhengzhou.testdemo.service.PositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * ：高英杰
 * ：2020-9-24
 **/
@Service
public class PositionServiceImpl implements PositionService {

    @Resource
    private PositionMapper positionMapper;


    @Override
    public List<VipResumeVo> selectByPositionandCompany(Map<String, Object> map) {
        List<VipResumeVo> resultMap = positionMapper.selectByPositionandCompany(map);
        return resultMap;
    }

    @Override
    public int insertPosition(Position position) {
        int result = positionMapper.insertPosition(position);
        return result;
    }

    @Override
    public int deletePosition(int position_id) {
        int result = positionMapper.deletePosition(position_id);
        return result;
    }

    @Override
    public int updatePosition(Position position) {
        int result =positionMapper.updatePosition(position);
        return result;
    }

    @Override
    public List<Position> selectPosition(Map<Object, Object> map) {
       List<Position> positionList = positionMapper.selectPosition(map);
        return positionList;
    }

    @Override
    public Integer selectNumbers(Integer position_id) {
        Integer numbers = positionMapper.selectNumbers(position_id);
        return numbers;
    }
}
