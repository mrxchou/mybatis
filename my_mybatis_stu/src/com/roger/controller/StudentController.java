package com.roger.controller;

import com.roger.bean.Student;
import com.roger.service.StudentService;
import com.roger.service.imp.StudentServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName: StudentController
 * @Author Administrator
 * @Date 2021/1/10 16:03
 * @Description:
 * @Version 1.0
 */
public class StudentController {
    private StudentService studentService = new StudentServiceImpl();
    /*
       查询所有学生信息
    */
    @Test
    public void findAllStu() {
        List<Student> list = studentService.findAllStu();
        for (Student student : list) {
            System.out.println(student);
        }
    }
    /*
       根据id查询学生信息
   */
    @Test
    public void findStuById() {
        Student stu = studentService.findStuById(1);
        System.out.println(stu);
    }
    /*
      插入一条学生信息
   */
    @Test
    public void insertStu() {
        Student student = new Student(null, "皓天", 23);
        Integer result = studentService.insertStu(student);
        if (result == 1) {
            System.out.println("添加成功!");
        } else {
            System.out.println("添加失败!");
        }
    }
    /*
      修改学生信息
   */
    @Test
    public void updateStu() {
        Student student = new Student(7, "码云", 43);
        Integer result = studentService.updateStu(student);
        if (result == 1) {
            System.out.println("修改成功!");
        } else {
            System.out.println("修改失败!");
        }
    }
    /*
      根据id删除学生信息
   */
    @Test
    public void deleteStuById() {
        Integer result = studentService.deleteStuById(7);
        if (result == 1) {
            System.out.println("删除成功!");
        } else {
            System.out.println("删除失败!");
        }
    }
}
