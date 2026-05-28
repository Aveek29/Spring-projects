package com.telusko.springdatajpaex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.springdatajpaex.model.Student;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SpringDataJpaExApplication.class, args);
	  Student s2=context.getBean(Student.class);

	  StudentRepo repo=context.getBean(StudentRepo.class);

	  s2.setRollNo(102);
	  s2.setName("Kiran");
	  s2.setMarks(65);

	  repo.delete(s2);
	}

}
