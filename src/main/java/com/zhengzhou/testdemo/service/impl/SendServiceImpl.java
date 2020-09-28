package com.zhengzhou.testdemo.service.impl;
import com.zhengzhou.testdemo.domain.Send;
import com.zhengzhou.testdemo.mapper.PositionMapper;
import com.zhengzhou.testdemo.mapper.ResumeMapper;
import com.zhengzhou.testdemo.mapper.SendMapper;
import com.zhengzhou.testdemo.service.SendService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 投递业务层
 */
@Service
public class SendServiceImpl implements SendService {

    /**
     * SendMapper注入
     */
    @Resource
    private SendMapper sendMapper;

    /**
     * PositionMapper注入
     */
    @Resource
    private PositionMapper positionMapper;

    /**
     * ResumeMapper注入
     */
    @Resource
    private ResumeMapper resumeMapper;

    /**
     * 投递简历功能，并且校验简历是否重复,如果招聘人数已满，提示招聘人数已满
     * @param send send对象
     * @return 1.插入成功 2.职位招聘数已满 3.简历重复
     */
    @Override
    public int insertSend(Send send) {
       int res = 0 ;
       //查询职位招聘数
      Integer numbers =   positionMapper.selectNumbers(send.getPosition_id());
      if(numbers == 0 ){
          res = 2;
          return  res;
      }else{
          //查询简历id是否重复
       List<Integer> idList = resumeMapper.selectId(send.getResume_id());
          for (int id : idList ){
              if(send.getResume_id() == id){
                  res = 3 ;
                  break;
              }
            }
      }
        if(res == 3){
            return res ;
        }else {
            int result =  sendMapper.insertSend(send);
            return result;
        }
    }

    /**
     * 修改面试结果
     * @param send 投递对象
     * @return 返回修改记录条数
     */
    @Override
    public int updateInterviewResult(Send send) {
        int result = sendMapper.updateInterviewResult(send);
        return result;
    }
}
