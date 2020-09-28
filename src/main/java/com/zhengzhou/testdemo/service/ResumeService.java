package com.zhengzhou.testdemo.service;

import com.zhengzhou.testdemo.domain.Resume;
import com.zhengzhou.testdemo.domain.Vip;

import java.util.List;

public interface ResumeService {
    int insertResume(Resume resume);

    int deleteResume(Resume resume);

    int updateResume(Resume resume);

    List<Integer> selectId(Integer resume_id);
}
