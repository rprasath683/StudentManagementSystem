package com.example.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.example.sms.entity.Staff;
import com.example.sms.repository.StaffRepository;
import com.example.sms.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService{
	
private StaffRepository staffRepository;
	
	
	@Autowired
	public StaffServiceImpl(StaffRepository staffRepository) {
		super();
		this.staffRepository = staffRepository;
	}


	@Override
	public List<Staff> getAllStaff() {
		// TODO Auto-generated method stub
		return staffRepository.findAll();
	}


	@Override
	public Staff saveStaff(Staff staff) {
		return staffRepository.save(staff);
	}


	@Override
	public Staff getStaffById(Long staffId) {
		
		return staffRepository.findById(staffId).get();
	}


	@Override
	public Staff updateStaff(Staff staff) {
		
		return staffRepository.save(staff);
	}


	@Override
	public void deleteStaff(Long staffId) {
		
		staffRepository.deleteById(staffId);
		
	}



}
