package com.StudentManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.StudentManagement.entity.Student;
import com.StudentManagement.service.StudentService;

@org.springframework.stereotype.Controller
public class Controller {
    
    @Autowired
    private StudentService studentService; // Renamed variable to follow Java naming conventions
    
    @GetMapping("/home")
    public String home() {
        return "home"; // Assuming you have a view named "home"
    }  
    
    @GetMapping("/students")
    public String getAllStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students"; // Assuming you have a view named "students"
    }
    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
    	Student student=new Student();
    	model.addAttribute("student", student);
    	return "create-student";
    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
    	studentService.saveStudent(student);
    	return "redirect:/students";
    	
    }
    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable int id, Model model) {
    	model.addAttribute("student", studentService.getById(id));
    	return "edit_student";
    }
    
    @PostMapping("/students/edit/{id}")
    public String updateStudent(@PathVariable int id ,@ModelAttribute("student") Student student) {
    	Student existingStudent=studentService.getById(id);
    	existingStudent.setFirstName(student.getFirstName());
    	existingStudent.setLastName(student.getLastName());
    	existingStudent.setEmail(student.getEmail());
    	studentService.saveStudent(existingStudent);
    	return "redirect:/students";
    }
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {
    	studentService.deleteById(id);
    	return "redirect:/students";
    }
}
