package com.kdkj.py.service;


import com.kdkj.py.entity.Log;

import java.util.List;

public interface LogService {
    int logDeleteByPrimaryKey(String id);

    int logInsert(Log record);

    Log logSelectByPrimaryKey(String id);

    List<Log> logSelectAll();

    int logUpdateByPrimaryKey(Log record);
    
    List<Log> logSelectByAttribute(Log log);
}