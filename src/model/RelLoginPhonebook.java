package model;

import java.util.List;

public class RelLoginPhonebook {
	private Login login;
	private List<Phonebook> phonebook;

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public List<Phonebook> getPhonebook() {
		return phonebook;
	}

	public void setPhonebook(List<Phonebook> phonebook) {
		this.phonebook = phonebook;
	}

}
