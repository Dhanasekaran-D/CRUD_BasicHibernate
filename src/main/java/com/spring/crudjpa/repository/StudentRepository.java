package com.spring.crudjpa.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.crudjpa.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, UUID> {

}
