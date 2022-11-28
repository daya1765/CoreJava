package com.domain.studentmanagementsystem;

import java.util.List;

import com.dao.StudentDao;
import com.dao.StudentDetailDao;
import com.entity.Student;
import com.entity.StudentDetail;



public class App 
{
    public static void main( String[] args )
    {
    	 // Save two students
        Student student = new Student("Amit", "Varma", "amitv45@gmail.com");
        StudentDetail studentDetail = new StudentDetail("http://www.youtube.com", "Piano");
        studentDetail.setStudent(student);
        student.setStudentDetail(studentDetail);
       
        Student student1 = new Student("Shree", "Kumar", "shreekumar@gmail.com");
        StudentDetail studentDetail1 = new StudentDetail("http://www.youtube.com", "Guitar");
        studentDetail1 .setStudent(student1);
        student1.setStudentDetail(studentDetail1);
       
        StudentDao studentDao = new StudentDao();
        studentDao.saveStudent(student);
        studentDao.saveStudent(student1);
        
        //StudentDetailDao stdd= new StudentDetailDao();
        //stdd.saveStudentDetail(studentDetail);
        //stdd.saveStudentDetail(studentDetail1);
        
        
        //test updateStudent
        student.setFirstName("RAMU");
        studentDao.updateStudent(student);
        
        //test getStudentById
        studentDao.getStudent(student.getId());
        
        //test deleteStudent
        studentDao.deleteStudent(1);
        
       
       
        // test getAllStudents
        List<Student> students = studentDao.getAllStudent();
        students.forEach(studentTemp -> System.out.println(studentTemp.getFirstName()));
    }
}
