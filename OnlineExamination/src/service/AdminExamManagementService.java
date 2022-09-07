package service;

import java.time.LocalDate;
import java.util.List;

import entity.Exam;
public interface AdminExamManagementService {
	 Exam scheduleExamForStudent(int enrollmentId, int testPaperCode, LocalDate localDate, int examDurationInMinutes); 
	 Exam scheduleExamForBatch(String batchName, int testPaperCode, LocalDate localDate, int examDurationInMinutes); 
	 Exam changeTestPaperForStudent(int enrollmentId, int testPaperCode); 
	 Exam changeTestPaperForBatch(int enrollmentId, int testPaperCode); 
	 List<Exam> findAllResultsByBatchName(String batchName); 
	 Exam findResultByEnrollmentId(int enrollmentId); 
	 List<Exam> findAllResultsByStudId(String studentId); 
	 boolean releaseTestResultByEnrollmentId(int enrollmentId); 
	 boolean releaseAllTestResultForStudent(int studentId); 
	 boolean releaseAllTestResultForBatch(String batchName);

}
