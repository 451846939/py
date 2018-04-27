package com.kdkj.py.service.impl;

import com.kdkj.py.dao.LogMapper;
import com.kdkj.py.entity.Log;
import com.kdkj.py.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class LogServiceImpl implements LogService {
	@Resource
	private LogMapper logMapper;

	@Override
	public int logDeleteByPrimaryKey(String id) {
		return logMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int logInsert(Log record) {
		return logMapper.insert(record);
	}

	@Override
	public Log logSelectByPrimaryKey(String id) {
		return logMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Log> logSelectAll() {
		return logMapper.selectAll();
	}

	@Override
	public int logUpdateByPrimaryKey(Log record) {
		return logMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Log> logSelectByAttribute(Log log) {
		// TODO Auto-generated method stub
		return logMapper.selectByAttribute(log);
	}
	
}
