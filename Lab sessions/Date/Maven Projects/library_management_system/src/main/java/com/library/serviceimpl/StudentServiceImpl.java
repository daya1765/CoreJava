package com.library.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entity.Student;
import com.library.model.StudentDTO;
import com.library.repository.StudentRepository;
import com.library.service.StudentService;
import com.library.util.StudentConverter;




@Service
public class StudentServiceImpl implements StudentService {
	
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private StudentConverter  studentConverter;
	
	@Override
	public String addStudent(Student student) {
		
		String message=null;
		studentRepository.save(student);
		if(student!=null) {
			message="Student details saved successfully";
		}
		else {
			message="Student not found";
		}
		return message;
		
		
	}
	
	@Override
	public StudentDTO updateStudent(int studentId, Student student) {
		
		Student existingStudent=studentRepository.findById(studentId).get();
		existingStudent.setName(student.getName());
		existingStudent.setPhone(student.getPhone());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setBranch(student.getBranch());
		existingStudent.setYear(student.getYear());
		studentRepository.save(existingStudent);
		return studentConverter.convertToStudentDTO(existingStudent);
		
	}
	
	@Override
	public StudentDTO  getStudentById(int studentId){
		Student student= studentRepository.findById(studentId).get();
		return studentConverter.convertToStudentDTO(student);
		
	}
	
	@Override
	public List<StudentDTO>  getAllStudents(){
		
		List<Student> students=studentRepository.findAll();
		
		List<StudentDTO> studentDTO= new ArrayList<>();
		for(Student s:students ) {
			studentDTO.add(studentConverter.convertToStudentDTO(s));
		}
		return studentDTO;
		
	}
	
	@Override
	public String deleteStudentById(int studentId) {
		
		String message=null;
		Optional<Student> student=studentRepository.findById(studentId);
		if(student.isPresent()) {
			studentRepository.deleteById(studentId);
			message="Student Details deleted successfully";
		}
		else {
			message="Student not found";
		}
		return message;
	}
	
	
	@Override
	public void deleteAllStudents() {
		studentRepository.deleteAll();
	}
	
	
	@Override
	public List<StudentDTO>  getStudentByName(String name){
		List<Student> students =  studentRepository.getStudentByName(name);
		List<StudentDTO> studentDTO= new ArrayList<>();
		for(Student s:students) {
			studentDTO.add(studentConverter.convertToStudentDTO(s));
		}
		return studentDTO;
	}
	
	
	@Override
	public List<StudentDTO>  getStudentByYear(int year){
		List<Student> students= studentRepository.getStudentByYear(year);
		List<StudentDTO> studentDTO=new ArrayList<>();
		for(Student s1: students) {
			studentDTO.add(studentConverter.convertToStudentDTO(s1));
		}
		return studentDTO;
	}
	
	
	@Override
	public List<StudentDTO> getStudentByBranch(String branch){
		List<Student> students= studentRepository.getStudentByBranch(branch);
		List<StudentDTO> studentDTO= new ArrayList<>();
		for(Student s2:students) {
			studentDTO.add(studentConverter.convertToStudentDTO(s2));
		}
		return studentDTO;
	}
	
	
	
	

}
