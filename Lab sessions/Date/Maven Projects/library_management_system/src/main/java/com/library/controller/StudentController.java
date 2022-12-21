package com.library.controller;

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

import com.library.entity.Student;
import com.library.model.StudentDTO;
import com.library.service.StudentService;
import com.library.util.StudentConverter;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@Autowired
	private StudentConverter studentConverter;
	
	
	@PostMapping("/addStudent")
	public String addStudent(@RequestBody StudentDTO studentDTO) {
		final Student student = studentConverter.convertToStudentEntity(studentDTO);
		return studentService.addStudent(student);
		
	}
	
	@PutMapping("/updateStudent/{identity}")
	public StudentDTO updateStudent(@PathVariable("identity") int studentId, @RequestBody StudentDTO studentDTO) {
		Student student1=studentConverter.convertToStudentEntity(studentDTO);
		return studentService.updateStudent(studentId, student1);
	}
	
	
	@GetMapping("/getStudentById/{studentId}")
	public StudentDTO getStudentById( @PathVariable("studentId") int studentId) {
		return studentService.getStudentById(studentId);
	}
	
	
	@GetMapping("/getAllStudents")
	public List<StudentDTO> getAllStudents(){
		return studentService.getAllStudents();
		
	}
	
	
	@DeleteMapping("/deleteStudentById/{studentId}")
	public String deleteStudentById(@PathVariable("studentId") int studentId) {
		return studentService.deleteStudentById(studentId);
	}
	
	@DeleteMapping("/deleteAllStudents")
	public ResponseEntity<String> deleteAllStudents(){
		studentService.deleteAllStudents();
		return new ResponseEntity<String>("All students details "+"have been deleted ",HttpStatus.OK);
		
	}
	
	//Custom methods mapping
	@GetMapping("/getStudentByName/{name}")
	public List<StudentDTO> getStudentByName(@PathVariable("name") String name){
		return studentService.getStudentByName(name);
	}
	
	@GetMapping("/getStudentByYear/{year}")
	public List<StudentDTO> getStudentByYear(@PathVariable("year") int year){
		return studentService.getStudentByYear(year);
	}
	
	@GetMapping("/getStudentByBranch/{branch}")
	public List<StudentDTO>  getStudentByBranch(@PathVariable("branch") String branch){
		return studentService.getStudentByBranch(branch);
	}
	

}
