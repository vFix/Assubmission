package com.axis.assubmission.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_COURSE_SELECTION")
public class CourseSelection {
	public static final Integer STATUS_UNCHECKED = 0;
	public static final Integer STATUS_PASSED = 1;
	public static final Integer STATUS_UNPASSED = 2;
	@Id
	private Long id;
	@ManyToOne
	@JoinColumn(name = "studentId")
	private Student student;
	@Column
	private Timestamp insertedTime = new Timestamp(System.currentTimeMillis());
	@Column
	private Integer status;
	@ManyToOne
	@JoinColumn(name = "coursePlanId")
	private CoursePlan coursePlan;

	public CoursePlan getCoursePlan() {
		return coursePlan;
	}

	public Long getId() {
		return id;
	}

	public Timestamp getInsertedTime() {
		return insertedTime;
	}

	public Integer getStatus() {
		return status;
	}

	public Student getStudent() {
		return student;
	}

	public void setCoursePlan(CoursePlan coursePlan) {
		this.coursePlan = coursePlan;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setInsertedTime(Timestamp insertedTime) {
		this.insertedTime = insertedTime;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
