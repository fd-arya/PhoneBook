package model;

import java.util.Calendar;
import java.util.List;

public class UserContact {
	private String name;
	private String lestName;
	private Calendar dateBrtdate;
	private List<Contact> contacts;
	private List<String> emails;
	private String address;
	private String descrption;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLestName() {
		return lestName;
	}

	public void setLestName(String lestName) {
		this.lestName = lestName;
	}

	public Calendar getDateBrtdate() {
		return dateBrtdate;
	}

	public void setDateBrtdate(Calendar dateBrtdate) {
		this.dateBrtdate = dateBrtdate;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

}
