package com.roger.bean;

import java.util.List;

/**
 * @ClassName: Classes
 * @Author Administrator
 * @Date 2021/1/12 18:21
 * @Description:
 * @Version 1.0
 */
public class Classes {
    private Integer id;
    private String name;
    private List<Student> stu;

    public Classes() {
    }

    public Classes(Integer id, String name, List<Student> stu) {
        this.id = id;
        this.name = name;
        this.stu = stu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStu() {
        return stu;
    }

    public void setStu(List<Student> stu) {
        this.stu = stu;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stu=" + stu +
                '}';
    }
}
