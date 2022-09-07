package service;

import java.util.List;

import entity.Course;
import entity.Student;

public interface StudentRegisterService {
	boolean loginStudent(String username,String password);
	Student registerNewStudent(Student student);
	int updateStudentDetails(Student student);
	List<Course> findAllCourses();
	

}
