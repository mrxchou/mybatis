package com.roger.service;

import com.roger.bean.Student;

import java.util.List;

public interface StudentService {
    /*
           查询所有学生信息
        */
    public abstract List<Student> findAllStu();

    /*
        根据id查询学生信息
     */
    public abstract Student findStuById(Integer id);
    /*
        插入一条学生信息
     */
    public abstract Integer insertStu(Student student);
    /*
        修改学生信息
     */
    public abstract Integer updateStu(Student student);

    /*
        根据id删除学生信息
     */
    public abstract Integer deleteStuById(Integer id);
}
