package com.kdkj.py.dao;


import com.kdkj.py.entity.Log;

import java.util.List;

public interface LogMapper {
    int deleteByPrimaryKey(String id);

    int insert(Log record);

    Log selectByPrimaryKey(String id);

    List<Log> selectAll();

    int updateByPrimaryKey(Log record);
    
    List<Log> selectByAttribute(Log log);
}