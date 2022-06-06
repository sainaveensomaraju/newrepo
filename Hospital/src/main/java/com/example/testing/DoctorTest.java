package com.example.testing;

import com.example.bean.Doctor;
import com.example.exception.InvalidSalaryException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DoctorTest {
	Doctor doctor;
	@BeforeEach
	public void init()
	{
	this.doctor=new Doctor();
	}
	@AfterEach
	public void f2()
	{
		doctor=null;
	}
	
	@Test
	public void test1()
	{
		Exception ex=assertThrows(Exception.class,()->this.doctor.setUserName("sum"));
		assertEquals("UserName is Too Short",ex.getMessage());
	}
	
	@Test
	public void test2()
	{
		Exception ex=assertThrows(Exception.class,()->this.doctor.setEmail("suma1999"));
		assertEquals("Email should contain @ ",ex.getMessage());
	}
	
	@Test
	public void test3()
	{
		Exception ex=assertThrows(Exception.class,()->this.doctor.setPhone("78996061"));
		assertEquals("Phone number should be 10 digits",ex.getMessage());
	}
	
	@Test
	public void test4()
	{
	Exception ex=assertThrows(InvalidSalaryException.class,()->this.doctor.setSalary(-1000));
	assertEquals("Salary cannot be negative",ex.getMessage());
	}
	
	
	

}
