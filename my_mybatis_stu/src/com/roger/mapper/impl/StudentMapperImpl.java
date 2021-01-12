package com.roger.mapper.impl;

import com.roger.bean.Student;
import com.roger.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName: StudentMapperImpl
 * @Author Administrator
 * @Date 2021/1/10 15:55
 * @Description:
 * @Version 1.0
 */
public class StudentMapperImpl implements StudentMapper {

    /*
       查询所有学生信息
    */
    @Override
    public List<Student> findAllStu() {
        List<Student> list = null;
        InputStream is = null;
        SqlSession sqlSession = null;
        try {
            //1.加载核心配置文件
            is = Resources.getResourceAsStream("MyBatisConfig.xml");
            //2.获取SqlSessionFactory工厂对象
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            //3.通过工厂对象获取sqlSession对象
            sqlSession = build.openSession(true);
            //4.执行映射配置文件中的sql语句，并接收结果
            list = sqlSession.selectList("StudentMapper.findAll");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.释放资源
            if (sqlSession != null)
                sqlSession.close();
            try {
                if(is!=null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //6.返回结果
        return list;
    }
    /*
          根据id查询学生信息
    */
    @Override
    public Student findStuById(Integer id) {

        InputStream is = null;
        SqlSession sqlSession = null;
        Student student = null;
        try {
            //1.加载核心配置文件
            is = Resources.getResourceAsStream("MyBatisConfig.xml");
            //2.获取SqlSessionFactory工厂对象
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            //3.通过工厂对象获取sqlSession对象
            sqlSession = build.openSession(true);
            //4.执行映射配置文件中的sql语句，并接收结果
            student = (Student)sqlSession.selectOne("StudentMapper.findOne",id);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.释放资源
            if (sqlSession != null)
                sqlSession.close();
            try {
                if(is!=null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //6.返回结果
        return student;
    }
    /*
           插入一条学生信息
    */
    @Override
    public Integer insertStu(Student student) {
        int result = 0;
        InputStream is = null;
        SqlSession sqlSession = null;
        try {
            //1.加载核心配置文件
            is = Resources.getResourceAsStream("MyBatisConfig.xml");
            //2.获取SqlSessionFactory工厂对象
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            //3.通过工厂对象获取sqlSession对象
            sqlSession = build.openSession(true);
            //4.执行映射配置文件中的sql语句，并接收结果
            result = sqlSession.insert("StudentMapper.insert",student);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.释放资源
            if (sqlSession != null)
                sqlSession.close();
            try {
                if(is!=null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //6.返回结果
        return result;
    }
    /*
           修改学生信息
    */
    @Override
    public Integer updateStu(Student student) {
        int result = 0;
        InputStream is = null;
        SqlSession sqlSession = null;
        try {
            //1.加载核心配置文件
            is = Resources.getResourceAsStream("MyBatisConfig.xml");
            //2.获取SqlSessionFactory工厂对象
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            //3.通过工厂对象获取sqlSession对象
            sqlSession = build.openSession(true);
            //4.执行映射配置文件中的sql语句，并接收结果
            result = sqlSession.update("StudentMapper.update",student);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.释放资源
            if (sqlSession != null)
                sqlSession.close();
            try {
                if(is!=null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //6.返回结果
        return result;
    }

    /*
        根据id删除学生信息
     */
    @Override
    public Integer deleteStuById(Integer id) {
        int result = 0;
        InputStream is = null;
        SqlSession sqlSession = null;
        try {
            //1.加载核心配置文件
            is = Resources.getResourceAsStream("MyBatisConfig.xml");
            //2.获取SqlSessionFactory工厂对象
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            //3.通过工厂对象获取sqlSession对象
            sqlSession = build.openSession(true);
            //4.执行映射配置文件中的sql语句，并接收结果
            result = sqlSession.delete("StudentMapper.delete",id);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.释放资源
            if (sqlSession != null)
                sqlSession.close();
            try {
                if(is!=null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //6.返回结果
        return result;
    }
}
