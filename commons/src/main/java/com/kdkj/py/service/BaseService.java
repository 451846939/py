package com.kdkj.py.service;

import java.io.Serializable;
import java.util.List;


public interface BaseService<T extends Serializable,id extends Serializable> {
	/**根据主键查询*/
	T selectByPrimaryKey(id id);
	/**查询一个*/
	T selectOne(T record);
	/**根据条件查询*/
	List<T> selectByRecord(T record);
	/**查询所有*/
	List<T> selectAll();
	/**添加*/
	int insert(T record);
	/**根据主键修改*/
	int updateByPrimaryKey(T record);
	/**根据主键删除*/
	int deleteByPrimaryKey(id id);

	/*	int insertList(List<T> list);*/

	/*int updateByPrimaryKeySelective(T record);*/

	/*int deleteBatch(String[] ids);*/
}
