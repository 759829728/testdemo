package com.zhengzhou.testdemo.service;

import com.zhengzhou.testdemo.domain.Send;

import java.util.List;
import java.util.Map;

public interface SendService {

    /**
     * 投递简历功能，并且校验简历是否重复,如果招聘人数已满，提示招聘人数已满
     * @param send send对象
     * @return 1.插入成功 2.职位招聘数已满 3.简历重复
     */
    int insertSend(Send send);

    /**
     * 修改面试结果
     * @param send 投递对象
     * @return 返回修改记录条数
     */
    int updateInterviewResult(Send send);
}
