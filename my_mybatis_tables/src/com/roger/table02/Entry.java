package com.roger.table02;

import com.roger.bean.Classes;
import com.roger.bean.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @ClassName: Entry
 * @Author Administrator
 * @Date 2021/1/12 18:01
 * @Description:
 * @Version 1.0
 */
public class Entry {
    @Test
    public void findAll() throws Exception{
        //1.读取mybatis配置文件
        InputStream is = Resources.getResourceAsStream("MyBatisConfig.xml");
        //2.获取工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3.获取SQLSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //4.获取OneToOneMapper的对象
        OneToManyMapper mapper = sqlSession.getMapper(OneToManyMapper.class);
        //5.用OneToOneMapper对象调用方法
        List<Classes> clazz = mapper.findAll();
        for (Classes classes : clazz) {
            System.out.println(classes.getId() + "," + classes.getName());
            List<Student> stus = classes.getStu();
            for (Student student : stus) {
                System.out.println(student);
            }
        }
        //6释放资源
        sqlSession.close();
        is.close();
    }
}
