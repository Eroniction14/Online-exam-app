package service;

import entity.Course;
import entity.TestPaper;
import entity.TestQuestion;

public interface AdminTestManagementService {
	TestPaper addNewTest(TestPaper testPaper, Course course);
	boolean removeQuestionById(int id); 
	TestPaper addQuestionForExistingTestPaper(TestPaper testPaper, TestQuestion testQuestion); 
	int removeTestPaper(TestPaper testPaper);
}
