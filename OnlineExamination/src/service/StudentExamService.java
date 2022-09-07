package service;

import java.util.List;

import entity.Exam;
import entity.ExamFormDTO;
import entity.TestQuestion;

public interface StudentExamService {
		List<TestQuestion> startTest(int examRollNo); 
		Exam submitTest(List<ExamFormDTO> examFormDto); 
		Exam getResultByExamRollNo(int examRollNo); 
		List<Exam> findAllResults (int studId); 
		List<Exam> searchResultsByCourseName(String courseName, int studId);

}
