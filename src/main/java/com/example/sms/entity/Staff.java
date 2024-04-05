package com.example.sms.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staffs")
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "teacherFirstName", nullable = false)
	private String teacherFirstName;
	
	@Column(name = "teacherLastName")
	private String teacherLastName;
	
	@Column(name = "teacherEmail")
	private String teacherEmail;
	
	@Column(name = "subject", nullable = false)
	private String subject;
	
	public Staff() {
		
	}
	
	public Staff(String teacherFirstName, String teacherLastName, String teacherEmail,String subject) {
		super();
		this.teacherFirstName = teacherFirstName;
		this.teacherLastName = teacherLastName;
		this.teacherEmail = teacherEmail;
		this.subject = subject;
	}
	

	public Long getId()  {
		   
			   return id;  
		 
		
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getTeacherFirstName() {
		return teacherFirstName;
	}
	public void setTeacherFirstName(String teacherFirstName) {
		this.teacherFirstName = teacherFirstName;
	}
	public String getTeacherLastName() {
		return teacherLastName;
	}
	public void setTeacherLastName(String teacherLastName) {
		this.teacherLastName = teacherLastName;
	}
	public String getTeacherEmail() {
		return teacherEmail;
	}
	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
