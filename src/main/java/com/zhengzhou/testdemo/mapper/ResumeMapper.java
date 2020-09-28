package com.zhengzhou.testdemo.mapper;

import com.zhengzhou.testdemo.domain.Resume;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ResumeMapper {
    int  insertResume(Resume resume);

    int deleteResume(int resume_id);

    int updateResume(Resume resume);

    List<Integer> selectId(Integer resume_id);
}
