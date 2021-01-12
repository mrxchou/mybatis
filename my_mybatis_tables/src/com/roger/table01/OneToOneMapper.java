package com.roger.table01;

import com.roger.bean.Person;

import java.util.List;

public interface OneToOneMapper {
    /**
     * Date: 15:03 2021/1/11
     * Description: 一对一多表查询
     */
    public abstract List<Person> findAll();
}
