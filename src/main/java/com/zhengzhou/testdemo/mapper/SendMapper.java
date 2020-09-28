package com.zhengzhou.testdemo.mapper;

import com.zhengzhou.testdemo.domain.Send;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SendMapper {

    int insertSend(Send send);

    int updateInterviewResult(Send send);
}
