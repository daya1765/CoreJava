package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.model.StudentDTO;
import com.student.service.StudentService;
import com.student.util.Converter;


@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private Converter converter;
	
	@PostMapping("/createStudent")
	public String createStudent(@RequestBody StudentDTO studentDTO) {
		final Student student=converter.convertToEntity(studentDTO);
		return studentService.createStudent(student);
		
	}
	
	@PutMapping("/updateStudent/{identity}")
	public StudentDTO updateStudent( @PathVariable("identity") int id,@RequestBody StudentDTO studentDTO) {
		Student student1= converter.convertToEntity(studentDTO);
		return studentService.updateStudent(id, student1);
	}
    
	
	@GetMapping("/getStudent/{id}")
	public StudentDTO getStudentById(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	}
	
	@GetMapping("/getAllStudents")
	public List<StudentDTO> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@DeleteMapping("/deleteStudentById")
	public String  deleteStudentById(int id) {
		return studentService.deleteStudentById(id);
	}
	
	@DeleteMapping("/deleteAllStudents")
	public ResponseEntity<String>  deleteAllStudents(){
		studentService.deleteAllStudents();
		return new ResponseEntity<String>("All Students details " +"have been deleted",HttpStatus.OK);
	}
}
