package com.spring.crudjpa.controller;



import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crudjpa.entity.Student;
import com.spring.crudjpa.service.StudentService;



@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	 StudentService studentService;

	@PostMapping(value = "/create")
	public ResponseEntity<Student> createUser(@RequestBody Student user) {
		
		studentService.saveUser(user);
		return ResponseEntity.ok(user);
	}
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Student> deleteuser(@PathVariable UUID id){
		studentService.deleteuser(id);
		return ResponseEntity.ok(null);
		
	}
	@PutMapping(value = "update")
	public ResponseEntity<Student> updateuser(@RequestBody Student user){
		studentService.updateuser(user);
		return ResponseEntity.ok(user);
		
	}

	@GetMapping(value = "/getall")
	public List<Student> getAllUsers() { 
		return studentService.getAll();
	}
	@GetMapping(value = "/get/{id}")
	public Student getByID(@PathVariable("id") UUID id) { 
		
		Optional<Student> userOptional = studentService.getByID(id);
		
		return userOptional.get();
	}
	
}
