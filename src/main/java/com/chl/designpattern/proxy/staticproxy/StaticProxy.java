package com.chl.designpattern.proxy.staticproxy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 静态代理
 *
 */
public class StaticProxy {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DPSAppConfig.class);
		UserDao userDao = ac.getBean(UserDaoProxy.class);
		int i = userDao.queryCount();
		System.out.println(i);

	}
}
