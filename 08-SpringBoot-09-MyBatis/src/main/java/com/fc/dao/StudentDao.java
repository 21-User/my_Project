package com.fc.dao;

import com.fc.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {
    //查询全部
    List<Student> findAll();
}
