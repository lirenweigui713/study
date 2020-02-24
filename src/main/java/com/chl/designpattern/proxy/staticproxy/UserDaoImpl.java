package com.chl.designpattern.proxy.staticproxy;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {

	static int count = 10;

	@Override
	public int queryCount() {
		System.out.println("查询用户数量中...");
		return count;
	}
}
