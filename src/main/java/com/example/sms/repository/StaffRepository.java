package com.example.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sms.entity.Staff;


public interface StaffRepository extends JpaRepository<Staff,Long> {

}
