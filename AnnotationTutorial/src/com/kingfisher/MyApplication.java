package com.kingfisher;

import com.spring.io.ComponentScan;
import com.spring.io.SpringApplication;
import com.spring.io.SpringBootApplication;

@SpringBootApplication
@ComponentScan({ "com.kingfisher.jira.controller", "com.kingfisher.wiki.service" })
public class MyApplication {

	public static void main(String args[]) {
		SpringApplication.run(MyApplication.class, args);
	}

}
