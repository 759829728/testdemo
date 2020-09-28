package com.zhengzhou.testdemo.mapper;

import com.zhengzhou.testdemo.domain.Send;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SendMapper {

    /**
     * 投递简历功能，并且校验简历是否重复,如果招聘人数已满，提示招聘人数已满
     * @param send send 对象
     * @return 返回插入记录条数
     */
    int insertSend(Send send);

    /**
     * 修改面试结果
     * @param send 投递对象
     * @return 返回修改记录条数
     */
    int updateInterviewResult(Send send);
}
