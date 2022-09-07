package service;

import entity.Course;
import entity.Student;

public interface AdminStudentManagementService {
	 
		Student enrollStudent (Student s, Course c); 
		Course addNewCourse(Course c); 
		Student deEnRollstudent(Student s,Course c);
}
