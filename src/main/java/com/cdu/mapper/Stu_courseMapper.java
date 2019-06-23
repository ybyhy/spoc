package com.cdu.mapper;

import com.cdu.bean.Stu_course;
import com.cdu.bean.Stu_courseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Stu_courseMapper {
    int countByExample(Stu_courseExample example);

    int deleteByExample(Stu_courseExample example);

    int deleteByPrimaryKey(Integer scId);

    int insert(Stu_course record);

    int insertSelective(Stu_course record);

    List<Stu_course> selectByExample(Stu_courseExample example);

    Stu_course selectByPrimaryKey(Integer scId);

    int updateByExampleSelective(@Param("record") Stu_course record, @Param("example") Stu_courseExample example);

    int updateByExample(@Param("record") Stu_course record, @Param("example") Stu_courseExample example);

    int updateByPrimaryKeySelective(Stu_course record);

    int updateByPrimaryKey(Stu_course record);
}