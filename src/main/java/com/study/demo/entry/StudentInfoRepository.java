package com.study.demo.entry;

import com.study.demo.entry.StudentInfo;
import com.study.demo.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
@Repository
public interface StudentInfoRepository extends BaseMapper<StudentInfo, Long> {

    @Query(value = "select s.* from study s where s.name like %:name%", nativeQuery = true)
    List<StudentInfo> qryByCondiction(String name);


}
