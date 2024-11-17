package com.learn.springcore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springcore.entity.Student;

import jakarta.websocket.server.PathParam;

@RestController
public class Controller1 {

	@GetMapping("/name")
	public String name()
	{
		return "Rayyan";
	}
	
	@GetMapping("/myName")
	public String myName()
	{
		return "My name is Rayyan";
	}
	
	
	@GetMapping("/students")
	public Student student()
	{
		Student s1 = new Student();
		s1.setId(101);
		s1.setMarks(89);
		s1.setName("Rayyan");
		return s1;
	}
	
	@GetMapping("/listOfStudent")
	public List<Student> listOfStudent()
	{
		
		List<Student> st1=new ArrayList<Student>();
		st1.add(new Student(102,"Faizan",90));
		st1.add(new Student(103, "Qasim",88));
		st1.add(new Student(104,"Asrar",99));
		
		return st1;
		
	}
	
	@GetMapping("/students/{id}")
	public String learnPathVariable(@PathVariable ("id") int userId)
	{
		System.out.println(userId);
		return "data fetch successfully";
	}
	
	@PostMapping("/students1")
	public Student addStudent(@RequestBody Student student)
	{
		System.out.println(student);
		return student;
	}
	
	
	
}
