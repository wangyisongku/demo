package com.study.demo.controller;

import com.study.demo.entry.StudentInfo;
import com.study.demo.entry.StudentInfoRepository;
import com.study.demo.mapper.StudentInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentInfoController {

    @Autowired
    private StudentInfoRepository studyInfoRepository;

        @Autowired
    private StudentInfoMapper studentInfoMapper;

    @GetMapping(path = "/list")
    public List<StudentInfo> list() {
        List<StudentInfo> all = studyInfoRepository.findAll();
        return all;
    }

    @GetMapping(path = "/list/condiction")
    public List<StudentInfo> listCondiction(String name) {
        List<StudentInfo> all = studyInfoRepository.qryByCondiction(name);
        return all;
    }

    @PostMapping(path = "/stu")
    public List<StudentInfo> qryByCondition(@RequestBody StudentInfo studentInfo) {
        List<StudentInfo> all = studentInfoMapper.qryByCondition(studentInfo);
        return all;
    }
}
