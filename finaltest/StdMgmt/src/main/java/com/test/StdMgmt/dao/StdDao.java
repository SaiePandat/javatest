package com.test.StdMgmt.dao;

import java.util.List;

import com.test.StdMgmt.Entity.Student;

public interface StdDao {
public List<Student> getAllStudent();
	
	public Student findById(int id);
	
	public Student save(Student st);
	
	public String delete(int id);

}
