package com.StudentManagement.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagement.entity.Student;
import com.StudentManagement.repository.StudentRepository;
import com.StudentManagement.service.StudentService;
@Service
public class ServiceImp implements StudentService {

	@Autowired
        com.StudentManagement.repository.StudentRepository  studentRepo;
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Student getById(int id) {
		
		// TODO Auto-generated method stub
		return studentRepo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
	 studentRepo.deleteById(id);
		
	}

}
