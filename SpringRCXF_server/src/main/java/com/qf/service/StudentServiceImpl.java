package com.qf.service;

import com.qf.dto.StudentDTO;

/**
 * Created by Administrator on 2018\3\13 0013.
 */
public class StudentServiceImpl implements StudentService {
    @Override
    public StudentDTO findById(Long sid) {
        StudentDTO studentDTO=new StudentDTO();
        studentDTO.setId(sid);
        studentDTO.setName("java工程师");

        return studentDTO;
    }
}
