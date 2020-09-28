package com.zhengzhou.testdemo.service.impl;
import com.zhengzhou.testdemo.domain.Resume;
import com.zhengzhou.testdemo.mapper.ResumeMapper;
import com.zhengzhou.testdemo.service.ResumeService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 简历业务层
 **/
@Service
public class ResumeServiceImpl implements ResumeService {

    /**
     * ResumeMapper注入
     */
    @Resource
    private ResumeMapper resumeMapper;

    /**
     * 对简历表数据的添加
     * @param resume 简历对象
     * @return 返回插入记录条数
     */
    @Override
    public int updateResume(Resume resume) {
        int result =resumeMapper.updateResume(resume);
        return result;
    }

    /**
     * 对简历表数据的删除
     * @param resume 简历对象
     * @return 返回删除记录条数
     */
    @Override
    public int deleteResume(Resume resume) {
        int result = resumeMapper.deleteResume(resume.getResume_id());
        return result;
    }

    /**
     * 对简历表数据的修改
     * @param resume 简历对象
     * @return 返回修改记录条数
     */
    @Override
    public int insertResume(Resume resume) {
        int result = resumeMapper.insertResume(resume);
        return result;
    }

    /**
     * 查询简历id是否重复
     * @param resume_id 简历id
     * @return 返回简历id集合
     */
    @Override
    public List<Integer> selectId(Integer resume_id) {
        List<Integer> result = resumeMapper.selectId(resume_id);
        return result;
    }

}
