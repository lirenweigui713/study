package com.chl.designpattern.proxy.staticproxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDaoProxy implements UserDao {

	@Autowired
	private  UserDao userDao;
	@Override
	public int queryCount() {
		System.out.println("记录日志：某人查询用户数量");
		return userDao.queryCount();
	}
}
