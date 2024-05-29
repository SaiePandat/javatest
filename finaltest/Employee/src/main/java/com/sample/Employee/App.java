package com.sample.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */

public class App 
{
	
    public static void main( String[] args ) throws IOException
    {
    Employee ep=new Employee();
    
    
   ep.setEmpName("Pratham");
   ep.setCity("newyork");
   ep.setJoiningDate(new Date());
   
//   FileInputStream fs=new FileInputStream("src/main/java/person.jpg");
//   byte[] mg=new byte[fs.available()];
//   fs.read();
//   ep.setImg(mg);
    
    
    
    
     SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
     Session sn=factory.getCurrentSession();
     Transaction tn=sn.beginTransaction();
     sn.save(ep);
     tn.commit();
     System.out.println("Done");
     sn.close();
     factory.close();
    }
}
