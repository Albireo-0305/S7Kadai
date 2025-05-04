package com.example.S7;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
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


  @GetMapping("/studentList")
  public List<Student> getStudent() {
    return repository.search();
  }
}


