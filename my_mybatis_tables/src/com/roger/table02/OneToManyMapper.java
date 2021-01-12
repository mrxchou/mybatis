package com.roger.table02;
import com.roger.bean.Classes;

import java.util.List;

public interface OneToManyMapper {
    /*
    多表查询：一对多
     */
    public abstract List<Classes> findAll();
}
