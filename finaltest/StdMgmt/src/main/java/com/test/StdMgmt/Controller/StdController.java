package com.test.StdMgmt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.StdMgmt.Entity.Student;
import com.test.StdMgmt.dao.StdDao;


@RestController
public class StdController {
private StdDao studentDao;
	
	@Autowired
	public StdController(StdDao studentDao) {
		this.studentDao=studentDao;
	}
		@GetMapping("/")
		public List<Student> getAllStudent(){
			return studentDao.getAllStudent();
		}
		@GetMapping("/get/{id}")
		public Student getStudent(@PathVariable int id) {
			return studentDao.findById(id);
		}
		
		@PostMapping("/save")
		public Student saveStudent(@RequestBody Student st) {
			return studentDao.save(st);
		}
		
		@DeleteMapping("/delete/{id}")
		public String deleteStudent(@PathVariable int id) {
			return studentDao.delete(id);
		}
		
		@PutMapping("/update/{id}")
		public Student updateStudent(@RequestBody Student st) {
			return studentDao.save(st);
			
		}
}





