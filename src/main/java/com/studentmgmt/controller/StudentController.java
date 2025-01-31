package com.studentmgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.studentmgmt.model.Student;
import com.studentmgmt.service.StudentService;

@Controller
public class StudentController {
	// controller -> service -> repository -> db
	
	@Autowired
	StudentService studentService;
	
	//localhost:8080/students
	
	//Step 1: List all students
	
	@GetMapping("/students")
	public String listAllStudents(Model model) {
//		System.out.println("Method to hit ho raha hai bhai");
		model.addAttribute("students", studentService.listAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String displayCreateForm(Model model) {
		Student s = new Student();
		model.addAttribute("student", s);
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student) {
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		studentService.saveStudent(existingStudent);
		
		return "redirect:/students";
	}
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		
		return "redirect:/students";
	}
}
