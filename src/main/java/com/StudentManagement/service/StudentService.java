package com.StudentManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagement.entity.Student;
import com.StudentManagement.repository.StudentRepository;

public interface StudentService {
  
	public List<Student>getAllStudents();
	public Student saveStudent(Student student);
	public Student getById(int id);
	public void deleteById(int id);
		
}
