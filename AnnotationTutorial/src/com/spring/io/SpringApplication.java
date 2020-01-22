package com.spring.io;

import java.util.Arrays;
import java.util.Set;

import org.reflections.Reflections;

public class SpringApplication {

	public static void run(Class classz, String[] args) {
		System.out.println("Starting spring framework (v2.2.4)");
		System.out.println("main started from class: " + classz.getCanonicalName());
		try {
			if (Class.forName(classz.getCanonicalName()).isAnnotationPresent(ComponentScan.class)) {
				System.out.println("Componenet scan present");
				ComponentScan components = Class.forName(classz.getCanonicalName()).getAnnotation(ComponentScan.class);
				for (String packagePath : Arrays.asList(components.value())) {
					System.out.println("Scanning package: " + packagePath);
					Reflections reflections = new Reflections("com.kingfisher.jira.controller");
					Set<String> classes = reflections.getAllTypes();
					for (String classx : classes) {
						System.out.println(classx);
					}
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
