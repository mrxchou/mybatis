package com.roger.paging;

import com.github.pagehelper.PageHelper;
import com.roger.bean.Student;
import com.roger.service.StudentService;
import com.roger.service.imp.StudentServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName: TestPaging
 * @Author Administrator
 * @Date 2021/1/11 14:21
 * @Description:
 * @Version 1.0
 */
public class TestPaging {
    private StudentService studentService = new StudentServiceImpl();

    @Test
    public void TestPaging() {
        PageHelper.startPage(3, 3);
        List<Student> list = studentService.findAllStu();

        for (Student student : list) {
            System.out.println(student);
        }
    }
}
