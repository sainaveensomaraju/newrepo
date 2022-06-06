package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.bean.AppointmentSatus;
import com.example.service.AppointmentStatusService;

public class AppointmentStatusController {
	
	@Autowired
	private AppointmentStatusService service;
	@PostMapping("/addstatus")
	public AppointmentSatus addAppointmentSatus(@RequestBody AppointmentSatus appointmentSatus) {
		return this.service.addStatus(appointmentSatus);
	}
	

	@GetMapping("/getAllstatus")
	public List<AppointmentSatus> getAll(){
		return this.service.getAll();
	}
}
