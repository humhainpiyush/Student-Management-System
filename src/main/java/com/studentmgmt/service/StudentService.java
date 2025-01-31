package com.studentmgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmgmt.model.Student;
import com.studentmgmt.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	//list all students -> read all students
	public List<Student> listAllStudents() {
		return studentRepository.findAll();
	}
	
	//save student -> writes a student in the database
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	//get student by id(id) -> returns the student by id
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}
	//update student(Student student) -> updates the student with new details
	
	//delete student by id(id) -> deletes student of that particular id
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}
}
