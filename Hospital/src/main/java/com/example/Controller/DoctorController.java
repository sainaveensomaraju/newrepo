package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Doctor;
import com.example.service.AdminService;
import com.example.service.DoctorService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DoctorController {

	@Autowired
	private DoctorService service;
	@Autowired
	private AdminService adminService;

	@PostMapping("/add")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		
			return this.service.save(doctor);

	}

	@GetMapping("/get")
	public List<Doctor> getAllDoctors() {
		
			return this.service.listAll();
		
	}

	@GetMapping("/searchid/{id}")
	public Doctor getById(@PathVariable(name = "id") int id) {
			return this.service.getById(id);

	}

	@GetMapping("/searchname/{username}")
	public Doctor getByName(@PathVariable(name ="username") String username) {
		
			return this.service.getbyUserName(username);
	}

	@PutMapping("searchbyid/{id}")
	public Doctor updateDoctor(@PathVariable(name = "id") int id, @RequestBody Doctor doctor) {

			
				return this.service.updateData(id,doctor);
			
	
	}

	@DeleteMapping("/deletebyid/{id}")
	public boolean delete(@PathVariable(name = "id") int id) {


			Doctor doc = this.service.getById(id);
			if (doc != null) {
				this.service.delete(id);
				return true;
		}	
		return false;
	}
}
