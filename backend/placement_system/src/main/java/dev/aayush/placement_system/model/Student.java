package dev.aayush.placement_system.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column	private String name;
	@Column private Date dob;
	@Column private boolean passed;
	@Column private String course;
	@Column private Date course_start;
	@Column	private Date course_end;
	@Column private String gender;
	@Column private boolean placed;
	@Column private String email;
	@Column private String company;
	@Column private String interview_exp;
	@Column private int work_exp;
	
	public Student(int id, String name, Date dob, boolean passed, String course, Date course_start, Date course_end,
			String gender, boolean placed, String email, String company, String interview_exp,
			int work_exp) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.passed = passed;
		this.course = course;
		this.course_start = course_start;
		this.course_end = course_end;
		this.gender = gender;
		
		this.placed = placed;
		this.email = email;
		this.company = company;
		this.interview_exp = interview_exp;
		this.work_exp = work_exp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public boolean isPassed() {
		return passed;
	}

	public void setPassed(boolean passed) {
		this.passed = passed;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Date getCourse_start() {
		return course_start;
	}

	public void setCourse_start(Date course_start) {
		this.course_start = course_start;
	}

	public Date getCourse_end() {
		return course_end;
	}

	public void setCourse_end(Date course_end) {
		this.course_end = course_end;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}



	public boolean isPlaced() {
		return placed;
	}

	public void setPlaced(boolean placed) {
		this.placed = placed;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getInterview_exp() {
		return interview_exp;
	}

	public void setInterview_exp(String interview_exp) {
		this.interview_exp = interview_exp;
	}

	public int getWork_exp() {
		return work_exp;
	}

	public void setWork_exp(int work_exp) {
		this.work_exp = work_exp;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + ", passed=" + passed + ", course=" + course
				+ ", course_start=" + course_start + ", course_end=" + course_end + ", gender=" + gender
				 + ", placed=" + placed + ", email=" + email + ", company="
				+ company + ", interview_exp=" + interview_exp + ", work_exp=" + work_exp + "]";
	}
	
	
	
}
