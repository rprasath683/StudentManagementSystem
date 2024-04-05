package com.example.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sms.entity.Staff;

@Service
public interface StaffService {
	List<Staff> getAllStaff();
	Staff saveStaff(Staff staff);
	Staff getStaffById(Long staffId);
	Staff updateStaff(Staff staff);
	void deleteStaff(Long staffId);

}
