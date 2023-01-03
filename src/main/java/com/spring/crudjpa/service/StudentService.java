package com.spring.crudjpa.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crudjpa.entity.Student;
import com.spring.crudjpa.repository.StudentRepository;

@Service
public class StudentService {
@Autowired
	public StudentRepository studentRepository;
public void saveUser(Student user){
	studentRepository.save(user);
}
public void deleteuser(UUID id) {
	studentRepository.deleteById(id);
	
}
public void updateuser(Student user) {
	studentRepository.save(user);
	
}
public List<Student> getAll() {

	return (List<Student>) studentRepository.findAll();
}
public Optional<Student> getByID(UUID id) {

	return studentRepository.findById(id);
}
	
}
