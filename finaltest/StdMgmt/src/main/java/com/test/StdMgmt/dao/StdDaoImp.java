package com.test.StdMgmt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.StdMgmt.Entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
public class StdDaoImp implements StdDao{
	private EntityManager entitymanager;
	
	@Autowired
	public StdDaoImp(EntityManager entitymanager) {
		super();
		this.entitymanager = entitymanager;
	}

	@Override
	public List<Student> getAllStudent() {
		TypedQuery<Student> std=entitymanager.createQuery("From Student",Student.class);
		List<Student> resultList=std.getResultList();
		return resultList;
	}

	@Override
	public Student findById(int id) {
		return entitymanager.find(Student.class,id);
		
	}

	@Override
	@Transactional
	public Student save(Student st) {
		Student dbstudent=entitymanager.merge(st);
		return dbstudent;
	}

	@Override
	@Transactional
	public String delete(int id) {Student dbstudent=entitymanager.find(Student.class, id);
	entitymanager.remove(dbstudent);
		return "Deleted id:"+id;
	}

}
