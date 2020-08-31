package com.mongo.test;

import com.mongo.test.config.AppConfig;
import com.mongo.test.service.CityService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author simon
 * @date 2020/8/31 21:06
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(annotationConfigApplicationContext.getBean(CityService.class));
	}
}
