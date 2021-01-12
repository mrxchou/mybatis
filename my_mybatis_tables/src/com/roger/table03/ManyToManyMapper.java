package com.roger.table03;

import com.roger.bean.Student;

import java.util.List;

public interface ManyToManyMapper {
    /*
    多表查询
     */
    public abstract List<Student> findAll();
}
