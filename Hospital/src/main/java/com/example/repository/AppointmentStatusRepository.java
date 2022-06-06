package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.AppointmentSatus;
@Repository
public interface AppointmentStatusRepository extends JpaRepository<AppointmentSatus, Integer>{

}
