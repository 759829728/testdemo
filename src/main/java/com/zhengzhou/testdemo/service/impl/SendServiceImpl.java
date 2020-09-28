package com.zhengzhou.testdemo.service.impl;

import com.zhengzhou.testdemo.domain.Send;
import com.zhengzhou.testdemo.mapper.SendMapper;
import com.zhengzhou.testdemo.service.SendService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SendServiceImpl implements SendService {

    @Resource
    private SendMapper sendMapper;

    @Override
    public int insertSend(Send send) {
         int result =  sendMapper.insertSend(send);
        return result;
    }

    @Override
    public int updateInterviewResult(Send send) {
        int result = sendMapper.updateInterviewResult(send);
        return result;
    }
}
