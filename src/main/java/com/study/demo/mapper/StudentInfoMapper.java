package com.study.demo.mapper;

import com.study.demo.entry.StudentInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Mapper
public interface StudentInfoMapper {

    List<StudentInfo> qryByCondition(StudentInfo studentInfo);
}
