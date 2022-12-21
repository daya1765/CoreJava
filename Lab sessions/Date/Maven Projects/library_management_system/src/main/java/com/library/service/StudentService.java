package com.library.service;

import java.util.List;

import com.library.entity.Student;
import com.library.model.StudentDTO;



public interface StudentService {
	
	//declaring crud methods
	public String addStudent(Student student);
	public StudentDTO updateStudent(int studentId, Student student);
	public StudentDTO getStudentById(int studentId);
	public List<StudentDTO> getAllStudents();
	public String deleteStudentById(int studentId);
	public void deleteAllStudents();
	
	//declaring custom methods
	List<StudentDTO>  getStudentByName(String name);
	List<StudentDTO>  getStudentByYear(int year);
	List<StudentDTO>  getStudentByBranch(String branch);
	
	

}
