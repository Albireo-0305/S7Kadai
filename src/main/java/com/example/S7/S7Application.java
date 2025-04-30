package com.example.S7;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class S7Application {

	@Autowired
	private StudentRepository repository;

	public static void main(String[] args) {
		//localhost:8080
		SpringApplication.run(S7Application.class, args);
	}

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return repository.getAllStudents();
	}

	@PostMapping("/student")
	public void registerStudent(String name,int age){
		repository.registerStudent(name,age);
	}
	
	@PatchMapping("/student")
	public void updateStudent(String name,int age) {
		repository.updateStudent(name,age);
	}

	@DeleteMapping("/student")
	public void  deleteStudent(String name){
		repository.deleteStudent(name);
	}

	@GetMapping("/student")
	public String getStudent(@RequestParam("name")String name) {
		Student student=repository.searchByName(name);

		return student.getName()+" "+student.getAge()+"sai";
	}
}


