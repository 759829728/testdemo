package com.zhengzhou.testdemo.mapper;

import com.zhengzhou.testdemo.domain.Resume;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ResumeMapper {

    /**
     * 对简历表数据的添加
     * @param resume 简历对象
     * @return 返回插入记录条数
     */
    int  insertResume(Resume resume);

    /**
     * 对简历表数据的删除
     * @param resume_id 简历id
     * @return 返回删除记录条数
     */
    int deleteResume(int resume_id);

    /**
     * 对简历表数据的修改
     * @param resume 简历对象
     * @return 返回修改记录条数
     */
    int updateResume(Resume resume);

    /**
     * 查询简历id是否重复
     * @param resume_id 简历id
     * @return 返回简历id集合
     */
    List<Integer> selectId(Integer resume_id);
}
