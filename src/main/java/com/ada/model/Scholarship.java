package com.ada.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Scholarship {

	@Id
	@Column(name = "id_scholarship")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int scholarshipId;

	@OneToOne
	@JoinColumn(name = "id_student", nullable = false)
	@JsonBackReference
	private Student student;

	@OneToOne
	@JoinColumn(name = "id_course", nullable = false)
	@JsonBackReference
	private Course course;

	private boolean studies;

	private boolean works;

	private boolean income;

	@Column(name = "monthly_income")
	private int monthlyincome;

	private boolean dependents;

	@Column(name = "number_dependents")
	private int numberOfDependents;

	private boolean approved;

	public Scholarship() {
	}

	public Scholarship(Student student, Course course, boolean studies, boolean works, boolean income,
			int monthlyincome, boolean dependents, int numberOfDependents) {
		this.student = student;
		this.course = course;
		this.studies = studies;
		this.works = works;
		this.income = income;
		this.monthlyincome = monthlyincome;
		this.dependents = dependents;
		this.numberOfDependents = numberOfDependents;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getScholarshipId() {
		return scholarshipId;
	}

	public void setScholarshipId(int scholarshipId) {
		this.scholarshipId = scholarshipId;
	}

	public boolean isStudies() {
		return studies;
	}

	public void setStudies(boolean studies) {
		this.studies = studies;
	}

	public boolean isWorks() {
		return works;
	}

	public void setWorks(boolean works) {
		this.works = works;
	}

	public boolean isIncome() {
		return income;
	}

	public void setIncome(boolean income) {
		this.income = income;
	}

	public int getMonthlyincome() {
		return monthlyincome;
	}

	public void setMonthlyincome(int monthlyincome) {
		this.monthlyincome = monthlyincome;
	}

	public boolean isDependents() {
		return dependents;
	}

	public void setDependents(boolean dependents) {
		this.dependents = dependents;
	}

	public int getNumberOfDependents() {
		return numberOfDependents;
	}

	public void setNumberOfDependents(int numberOfDependents) {
		this.numberOfDependents = numberOfDependents;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

}
