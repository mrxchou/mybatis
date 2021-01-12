package com.roger.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.roger.bean.Student;
import com.roger.service.StudentService;
import com.roger.service.imp.StudentServiceImpl;
import org.junit.Test;

import java.util.ArrayList;
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
        //分页助手来实现分页
        //第一页：显示3条数据
        //PageHelper.startPage(1, 3);
        //第二页：显示3条数据
        //PageHelper.startPage(2, 3);
        //第三页：显示3条数据
        PageHelper.startPage(3, 3);
        List<Student> list = studentService.findAllStu();
        for (Student student : list) {
            System.out.println(student);
        }
        PageInfo<Student> studentPageInfo = new PageInfo<>(list);
        System.out.println("总条数：" + studentPageInfo.getTotal());
        System.out.println("总页数：" + studentPageInfo.getPages());
        System.out.println("当前页：" + studentPageInfo.getPageNum());
        System.out.println("每一页显示的条数：" + studentPageInfo.getSize());
        System.out.println("上一页：" + studentPageInfo.getPrePage());
        System.out.println("下一页：" + studentPageInfo.getNextPage());
        System.out.println("是否为第一页：" + studentPageInfo.isIsFirstPage());
        System.out.println("是否为最后一页：" + studentPageInfo.isIsLastPage());
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
        Student student = new Student(4, "邓凯", 18);
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

    /*
    多条件查询
    */
    @Test
    public void findCondition() {
        Student student = new Student();
        student.setId(2);
        student.setName("李四");
        student.setAge(24);
        List<Student> list = studentService.findCondition(student);
        for (Student stu : list) {
            System.out.println(stu);
        }
    }
    @Test
    public void findByIds() {
        List<Integer> ids = new ArrayList<>();
//        ids.add(1);
//        ids.add(2);
//        ids.add(5);
        List<Student> list = studentService.findByIds(ids);
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
