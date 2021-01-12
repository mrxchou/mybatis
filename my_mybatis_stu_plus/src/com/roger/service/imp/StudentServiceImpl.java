package com.roger.service.imp;

import com.roger.bean.Student;
import com.roger.mapper.StudentMapper;
import com.roger.service.StudentService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName: StudentServiceImpl
 * @Author Administrator
 * @Date 2021/1/10 15:53
 * @Description:
 * @Version 1.0
 */
public class StudentServiceImpl implements StudentService {


    /*
          查询所有学生信息
       */
    @Override
    public List<Student> findAllStu() {
        InputStream is = null;
        SqlSession sqlSession = null;
        List<Student> list = null;
        try {
            //1.加载配置文件
            is = Resources.getResourceAsStream("MyBatisConfig.xml");
            //2.获取工厂类对象
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            //3.获取sqlSession
            sqlSession = build.openSession(true);
            //4.获取StudentMapper接口的实现类对象
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            //5.通过实现类对象调用方法，接收结果
            list = mapper.findAllStu();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.释放资源
            if(sqlSession!=null)
                sqlSession.close();

            try {
                if(is!=null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //7.返回结果
        return list;
    }

    /*
              根据id查询学生信息
        */
    @Override
    public Student findStuById(Integer id) {
        InputStream is = null;
        SqlSession sqlSession = null;
        Student stu = null;
        try {
            //1.加载配置文件
            is = Resources.getResourceAsStream("MyBatisConfig.xml");
            //2.获取工厂类对象
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            //3.获取sqlSession
            sqlSession = build.openSession(true);
            //4.获取StudentMapper接口的实现类对象
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            //5.通过实现类对象调用方法，接收结果
            stu = mapper.findStuById(id);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.释放资源
            if(sqlSession!=null)
                sqlSession.close();

            try {
                if(is!=null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //7.返回结果
        return stu;
    }

    /*
               插入一条学生信息
        */
    @Override
    public Integer insertStu(Student student) {
        Integer result = null;
        InputStream is = null;
        SqlSession sqlSession = null;
        try {
            //1.加载配置文件
            is = Resources.getResourceAsStream("MyBatisConfig.xml");
            //2.获取工厂类对象
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            //3.获取sqlSession
            sqlSession = build.openSession(true);
            //4.获取StudentMapper接口的实现类对象
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            //5.通过实现类对象调用方法，接收结果
            result = mapper.insertStu(student);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.释放资源
            if(sqlSession!=null)
                sqlSession.close();

            try {
                if(is!=null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //7.返回结果
        return result;
    }

    /*
               修改学生信息
        */
    @Override
    public Integer updateStu(Student student) {
        Integer result = null;
        InputStream is = null;
        SqlSession sqlSession = null;
        try {
            //1.加载配置文件
            is = Resources.getResourceAsStream("MyBatisConfig.xml");
            //2.获取工厂类对象
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            //3.获取sqlSession
            sqlSession = build.openSession(true);
            //4.获取StudentMapper接口的实现类对象
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            //5.通过实现类对象调用方法，接收结果
            result = mapper.updateStu(student);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.释放资源
            if(sqlSession!=null)
                sqlSession.close();

            try {
                if(is!=null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //7.返回结果
        return result;
}

    /*
            根据id删除学生信息
    */
    @Override
    public Integer deleteStuById(Integer id) {
        Integer result = null;
        InputStream is = null;
        SqlSession sqlSession = null;
        try {
            //1.加载配置文件
            is = Resources.getResourceAsStream("MyBatisConfig.xml");
            //2.获取工厂类对象
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            //3.获取sqlSession
            sqlSession = build.openSession(true);
            //4.获取StudentMapper接口的实现类对象
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            //5.通过实现类对象调用方法，接收结果
            result = mapper.deleteStuById(id);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.释放资源
            if(sqlSession!=null)
                sqlSession.close();

            try {
                if(is!=null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //7.返回结果
        return result;
    }
    /*
        多条件查询
     */
    @Override
    public List<Student> findCondition(Student student) {
        InputStream is = null;
        SqlSession sqlSession = null;
        List<Student> list = null;
        try {
            //1.加载配置文件
            is = Resources.getResourceAsStream("MyBatisConfig.xml");
            //2.获取工厂类对象
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            //3.获取sqlSession
            sqlSession = build.openSession(true);
            //4.获取StudentMapper接口的实现类对象
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            //5.通过实现类对象调用方法，接收结果
            list = mapper.findCondition(student);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.释放资源
            if(sqlSession!=null)
                sqlSession.close();

            try {
                if(is!=null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //7.返回结果
        return list;
    }
    /*
        多个id查询
     */
    @Override
    public List<Student> findByIds(List<Integer> ids) {
        InputStream is = null;
        SqlSession sqlSession = null;
        List<Student> list = null;
        try {
            //1.加载配置文件
            is = Resources.getResourceAsStream("MyBatisConfig.xml");
            //2.获取工厂类对象
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            //3.获取sqlSession
            sqlSession = build.openSession(true);
            //4.获取StudentMapper接口的实现类对象
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            //5.通过实现类对象调用方法，接收结果
            list = mapper.findByIds(ids);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.释放资源
            if(sqlSession!=null)
                sqlSession.close();

            try {
                if(is!=null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //7.返回结果
        return list;
    }
}
