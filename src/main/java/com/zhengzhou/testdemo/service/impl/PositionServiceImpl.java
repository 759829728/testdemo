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
 * 职位业务层
 **/
@Service
public class PositionServiceImpl implements PositionService {

    /**
     * PositionMapper注入
     */
    @Resource
    private PositionMapper positionMapper;


    /**
     * 对职位表数据的插入
     * @param position 职位对象
     * @return 返回插入记录条数
     */
    @Override
    public int insertPosition(Position position) {
        int result = positionMapper.insertPosition(position);
        return result;
    }

    /**
     * 对职位表数据的删除
     * @param position_id 职位id
     * @return 返回删除记录条数
     */
    @Override
    public int deletePosition(int position_id) {
        int result = positionMapper.deletePosition(position_id);
        return result;
    }

    /**
     * 对职位表数据的修改
     * @param position 职位对象
     * @return 返回修改记录条数
     */
    @Override
    public int updatePosition(Position position) {
        int result =positionMapper.updatePosition(position);
        return result;
    }

    /**
     * 根据公司名称或职位名称或薪资范围或学历要求搜索查看职位信息，并可按多个条件进行搜索
     * @param map map集合
     * @return 返回职位信息集合
     */
    @Override
    public List<Position> selectPosition(Map<Object, Object> map) {
       List<Position> positionList = positionMapper.selectPosition(map);
        return positionList;
    }

    /**
     * 根据公司名称和职位名称查询会员信和简历信息
     * @param map map集合
     * @return 返回VipResumeVo对象
     */
    @Override
    public List<VipResumeVo> selectByPositionandCompany(Map<String, Object> map) {
        List<VipResumeVo> resultMap = positionMapper.selectByPositionandCompany(map);
        return resultMap;
    }

    @Override
    public Integer selectNumbers(Integer position_id) {
        Integer numbers = positionMapper.selectNumbers(position_id);
        return numbers;
    }
}
