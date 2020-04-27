package com.lgh.dao.impl;

import com.lgh.dao.IUserDao;
import com.lgh.entity.User;
import com.lgh.mapper.IUserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IUserDaoImpl extends SqlSessionDaoSupport implements IUserDao {

    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<User> selectList() {
        IUserMapper iUserMapper = getSqlSession().getMapper(IUserMapper.class);
        List<User> users = iUserMapper.selectList();
        return users;
    }
}
