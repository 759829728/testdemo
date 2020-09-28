package com.zhengzhou.testdemo.service;

import com.zhengzhou.testdemo.domain.Resume;
import com.zhengzhou.testdemo.domain.Vip;

import java.util.List;

public interface ResumeService {

    /**
     * 对简历表数据的添加
     * @param resume 简历对象
     * @return 返回插入记录条数
     */
    int insertResume(Resume resume);

    /**
     * 对简历表数据的删除
     * @param resume 简历对象
     * @return 返回删除记录条数
     */
    int deleteResume(Resume resume);

    /**
     * 对简历表数据的修改
     * @param resume 简历对象
     * @return 返回修改记录条数
     */
    int updateResume(Resume resume);

    List<Integer> selectId(Integer resume_id);
}
