package com.spring.io;

import java.util.Arrays;

public class SpringApplication {

	public static void run(Class classz, String[] args) {
		System.out.println("Starting spring framework (v2.2.4)");
		System.out.println("main started from class: " + classz.getCanonicalName());
		try {
			if (Class.forName(classz.getCanonicalName()).isAnnotationPresent(ComponentScan.class)) {
				System.out.println("Componenet scan present");
				ComponentScan components = Class.forName(classz.getCanonicalName()).getAnnotation(ComponentScan.class);
				System.out.println(Arrays.asList(components.value()));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
