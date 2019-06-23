package com.cdu.mapper;

import com.cdu.bean.Course_content;
import com.cdu.bean.Course_contentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Course_contentMapper {
    int countByExample(Course_contentExample example);

    int deleteByExample(Course_contentExample example);

    int deleteByPrimaryKey(Integer contentId);

    int insert(Course_content record);

    int insertSelective(Course_content record);

    List<Course_content> selectByExample(Course_contentExample example);

    Course_content selectByPrimaryKey(Integer contentId);

    int updateByExampleSelective(@Param("record") Course_content record, @Param("example") Course_contentExample example);

    int updateByExample(@Param("record") Course_content record, @Param("example") Course_contentExample example);

    int updateByPrimaryKeySelective(Course_content record);

    int updateByPrimaryKey(Course_content record);
}