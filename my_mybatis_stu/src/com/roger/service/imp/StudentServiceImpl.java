package com.roger.service.imp;

import com.roger.bean.Student;
import com.roger.mapper.StudentMapper;
import com.roger.mapper.impl.StudentMapperImpl;
import com.roger.service.StudentService;

import java.util.List;

/**
 * @ClassName: StudentServiceImpl
 * @Author Administrator
 * @Date 2021/1/10 15:53
 * @Description:
 * @Version 1.0
 */
public class StudentServiceImpl implements StudentService {
    private StudentMapper studentMapper = new StudentMapperImpl();

    /*
          查询所有学生信息
       */
    @Override
    public List<Student> findAllStu() {
        return studentMapper.findAllStu();
    }
    /*
              根据id查询学生信息
        */
    @Override
    public Student findStuById(Integer id) {
        return studentMapper.findStuById(id);
    }
    /*
               插入一条学生信息
        */
    @Override
    public Integer insertStu(Student student) {
        return studentMapper.insertStu(student);
    }
    /*
               修改学生信息
        */
    @Override
    public Integer updateStu(Student student) {
        return studentMapper.updateStu(student);
    }

    /*
            根据id删除学生信息
    */
    @Override
    public Integer deleteStuById(Integer id) {
        return studentMapper.deleteStuById(id);
    }
}
