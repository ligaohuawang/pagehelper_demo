package com.lgh.service.impl;

import com.github.pagehelper.PageHelper;
import com.lgh.dao.IUserDao;
import com.lgh.entity.PageBean;
import com.lgh.entity.User;
import com.lgh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private IUserDao iUserDao;

    @Override
    public PageBean selectPage(PageBean pageBean) {
        //TODO A7 Service的实现类中开启分页
        PageHelper.startPage(pageBean.getCurrentPage(),pageBean.getPageSize());
        //TODO A8 查询数据给pagehelper的page类。pagehelper的page类再通过构造方法给我们自己的page赋值
        List<User> users = iUserDao.selectList();
        PageBean pageBean1 = new PageBean();
        pageBean1.setList(users);
        return pageBean1;
    }
}
