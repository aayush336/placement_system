package dev.aayush.placement_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.aayush.placement_system.model.Student;
import dev.aayush.placement_system.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> get(){
		return studentService.get();
	}
}
