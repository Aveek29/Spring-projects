package com.telusko.SpringJDBCEx.service;

import org.springframework.stereotype.Service;
import com.telusko.SpringJDBCEx.model.Student;

@Service
public class StudentService {
	public void addStudent(Student s) {
		System.out.println("Student added: " + s);
	}
}
