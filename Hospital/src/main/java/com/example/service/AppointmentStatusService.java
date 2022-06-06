package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.bean.AppointmentSatus;
import com.example.repository.AppointmentStatusRepository;

@Service
public class AppointmentStatusService {

	
	private AppointmentStatusRepository repository;
	
	public AppointmentSatus addStatus(AppointmentSatus satus) {
		return this.repository.save(satus);
	}
	
	public AppointmentSatus getById(int id) {
		Optional<AppointmentSatus>optional=this.repository.findById(id);
		if(optional.isPresent())
			return optional.get();
		return null;
	}
	
	public List<AppointmentSatus> getAll(){
		return this.repository.findAll();
	}
	
	
}
