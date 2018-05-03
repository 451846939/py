package com.kdkj.py.service.impl;

import com.kdkj.py.dao.UsersMapper;
import com.kdkj.py.entity.Users;
import com.kdkj.py.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户service
 *
 * @author lin
 * @create 2018-05-02 17:45
 **/
@Service
@Transactional
public class UsersServiceImpl implements UsersService{
    @Resource
    private UsersMapper usersMapper;
    @Override
    public Users selectByPrimaryKey(String s) {

        return usersMapper.selectByPrimaryKey(s);
    }

    @Override
    public Users selectOne(Users record) {
        return usersMapper.selectOne(record);
    }

    @Override
    public List<Users> selectByRecord(Users record) {
//        usersMapper.selectByRowBounds()
        return usersMapper.select(record);
    }

    @Override
    public List<Users> selectAll() {
        return usersMapper.selectAll();
    }

    @Override
    public int insert(Users record) {
        return usersMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        return usersMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey(String s) {
        return usersMapper.deleteByPrimaryKey(s);
    }
}
