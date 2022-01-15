package model;

import java.util.Calendar;

import model.enums.EnumGender;

public class User {
	private String nationalID;
	private String user;
	private String password;
	private Calendar dateBrtdate;
	private String email;
	private String Phone;
	private byte[] photo;
	private String address;
	private EnumGender gender;

	public String getNationalID() {
		return nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Calendar getDateBrtdate() {
		return dateBrtdate;
	}

	public void setDateBrtdate(Calendar dateBrtdate) {
		this.dateBrtdate = dateBrtdate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public EnumGender getGender() {
		return gender;
	}

	public void setGender(EnumGender gender) {
		this.gender = gender;
	}

}
