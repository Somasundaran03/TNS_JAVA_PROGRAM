package com.TNS.Admin_service;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {

	private Integer Ad_id;
	private String  Ad_name;
	private String Ad_email;
	private String Ad_dept;
	private Float Ad_Cgpa;
	private Integer Ad_year;
	private String Ad_gender;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(Integer ad_id, String ad_name, String ad_email, String ad_dept, Float ad_Cgpa, Integer ad_year,
			String ad_gender) {
		super();
		Ad_id = ad_id;
		Ad_name = ad_name;
		Ad_email = ad_email;
		Ad_dept = ad_dept;
		Ad_Cgpa = ad_Cgpa;
		Ad_year = ad_year;
		Ad_gender = ad_gender;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getAd_id() {
		return Ad_id;
	}
	public void setAd_id(Integer ad_id) {
		Ad_id = ad_id;
	}
	public String getAd_name() {
		return Ad_name;
	}
	public void setAd_name(String ad_name) {
		Ad_name = ad_name;
	}
	public String getAd_email() {
		return Ad_email;
	}
	public void setAd_email(String ad_email) {
		Ad_email = ad_email;
	}
	public String getAd_dept() {
		return Ad_dept;
	}
	public void setAd_dept(String ad_dept) {
		Ad_dept = ad_dept;
	}
	public Float getAd_Cgpa() {
		return Ad_Cgpa;
	}
	public void setAd_Cgpa(Float ad_Cgpa) {
		Ad_Cgpa = ad_Cgpa;
	}
	public Integer getAd_year() {
		return Ad_year;
	}
	public void setAd_year(Integer ad_year) {
		Ad_year = ad_year;
	}
	public String getAd_gender() {
		return Ad_gender;
	}
	public void setAd_gender(String ad_gender) {
		Ad_gender = ad_gender;
	}
	@Override
	public String toString() {
		return "Admin [Ad_id=" + Ad_id + ", Ad_name=" + Ad_name + ", Ad_email=" + Ad_email + ", Ad_dept=" + Ad_dept
				+ ", Ad_Cgpa=" + Ad_Cgpa + ", Ad_year=" + Ad_year + ", Ad_gender=" + Ad_gender + "]";
	}
	
	
}
