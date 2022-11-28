package com.domain.studentmanagementsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNull;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentDaoTest {
	StudentDao studentOp;

	@BeforeEach
	public void setUp() throws Exception {
		studentOp = new StudentDao();
	}

	/*@After
	public void tearDown() throws Exception {
		studentOp = null;
	}*/

	@Test
	public void testDeleteStudent() {
		// storing the deleted student
		Student deletedStdId = studentOp.deleteStudent(2);

		// check if deleted
		assertEquals(null,deletedStdId);
	}

	/*@Test
	public final void testDeleteStudentException() {
		Assertions.assertThrows(IllegalStateException.class, () -> studentOp.deleteStudent(2));

	
		
	}*/

}
	
	


