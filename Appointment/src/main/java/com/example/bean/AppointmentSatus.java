package com.example.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
public class AppointmentSatus {
	@Column(name="status")
	private int id;
	@Transient
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AppointmentSatus [id=" + id + ", status=" + status + "]";
	}

	public AppointmentSatus(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}

	public AppointmentSatus() {
		super();
	}
	
	
	

}
