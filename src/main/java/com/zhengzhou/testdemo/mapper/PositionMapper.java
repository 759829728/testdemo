package com.zhengzhou.testdemo.mapper;

import com.zhengzhou.testdemo.Vo.VipResumeVo;
import com.zhengzhou.testdemo.domain.Position;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PositionMapper {


    /**
     * 对职位表数据的插入
     * @param position 职位对象
     * @return 返回插入记录条数
     */
    int insertPosition(Position position);

    /**
     * 对职位表数据的删除
     * @param position_id 职位id
     * @return 返回删除记录条数
     */
    int deletePosition(int position_id);

    /**
     * 对职位表数据的修改
     * @param position 职位对象
     * @return 返回修改记录条数
     */
    int updatePosition(Position position);


    /**
     * 根据公司名称或职位名称或薪资范围或学历要求搜索查看职位信息，并可按多个条件进行搜索
     * @param map map集合
     * @return 返回职位信息集合
     */
    List<Position> selectPosition(Map<Object, Object> map);

    /**
     * 根据公司名称和职位名称查询会员信和简历信息
     * @param map map集合
     * @return 返回VipResumeVo对象
     */
    List<VipResumeVo> selectByPositionandCompany(Map<String, Object> map);


    /**
     * 查询职位招聘数
     * @param position_id 职位id
     * @return 返回职位招聘人数
     */
    Integer selectNumbers(Integer position_id);
}
