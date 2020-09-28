package com.zhengzhou.testdemo.service.impl;

import com.zhengzhou.testdemo.domain.Resume;
import com.zhengzhou.testdemo.mapper.ResumeMapper;
import com.zhengzhou.testdemo.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ：高英杰
 * ：2020-9-24
 **/
@Service
public class ResumeServiceImpl implements ResumeService {

    @Resource
    private ResumeMapper resumeMapper;

    @Override
    public int updateResume(Resume resume) {
        int result =resumeMapper.updateResume(resume);
        return result;
    }

    @Override
    public List<Integer> selectId(Integer resume_id) {
        List<Integer> result = resumeMapper.selectId(resume_id);
        return result;
    }

    @Override
    public int insertResume(Resume resume) {
        int result = resumeMapper.insertResume(resume);
        return result;
    }

    @Override
    public int deleteResume(Resume resume) {
        int result = resumeMapper.deleteResume(resume.getResume_id());
        return result;
    }
}
