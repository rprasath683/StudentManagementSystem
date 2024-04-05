package com.example.sms.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.sms.entity.Staff;

import com.example.sms.service.StaffService;


@Controller
public class StaffController {
	
	private StaffService staffService;
	
	public StaffController(StaffService staffService) {
		
		this.staffService= staffService;
	}
	
//	List all students
	@GetMapping("/staffs")
	public String listStaff(Model model) {
		model.addAttribute("staffs", staffService.getAllStaff());
		return "staffs";
	}
//	add student
	@GetMapping("/staffs/new")
	public String createStaffForm(Model model) {

		// created student object to hold student form data
		Staff staff = new Staff();
		model.addAttribute("staff", staff);
		return "create_staff";
	}

//	save student
	@PostMapping("/staffs")
	public String saveStaff(@ModelAttribute("staff") Staff staff) {
		staffService.saveStaff(staff);
		return "redirect:/staffs";
	}

//	update student from page
	@GetMapping("/staffs/edit/{id}")
	public String editStaff(@PathVariable Long id, Model model) {
		Staff existingStaff = staffService.getStaffById(id);
		model.addAttribute("staff", existingStaff);
		return "edit_staff";
	}
	
	@PostMapping("/staffs/{id}")
	public String updateStudent(@PathVariable Long id, 
								@ModelAttribute("staff") Staff staff, 
								Model model) {
		// Get Student details from database
		Staff existingStaff = staffService.getStaffById(id);
		existingStaff.setId(staff.getId());
		existingStaff.setTeacherFirstName(staff.getTeacherFirstName());
		existingStaff.setTeacherLastName(staff.getTeacherLastName());
		existingStaff.setTeacherEmail(staff.getTeacherEmail());
		existingStaff.setSubject(staff.getSubject());
		
		// save updated student object
		staffService.updateStaff(existingStaff);
		
		return "redirect:/staffs";
	}
	
	@GetMapping("/staffs/{id}")
	public String deleteStaff(@PathVariable Long id) {
		staffService.deleteStaff(id);
		return "redirect:/staffs";
	}


}
