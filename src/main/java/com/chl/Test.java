package com.chl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class Test {

//	@Autowired
//	TestCom testCom;

	public static void main(String[] args) {
		long count = 10000000000l;
		System.out.println(System.currentTimeMillis());
		for (long j=0;j<count;j++){
			int i = 99;
			int ii = i;
			ii++;
		}
		System.out.println(System.currentTimeMillis());


	}

}
