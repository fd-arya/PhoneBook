package model;

import java.util.List;

public class Phonebook {
	private RelLoginPhonebook relLoginPhonebook;
	private Group group;
	private List<UserContact> userContact;

	public RelLoginPhonebook getRelLoginPhonebook() {
		return relLoginPhonebook;
	}

	public void setRelLoginPhonebook(RelLoginPhonebook relLoginPhonebook) {
		this.relLoginPhonebook = relLoginPhonebook;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public List<UserContact> getUserContact() {
		return userContact;
	}

	public void setUserContact(List<UserContact> userContact) {
		this.userContact = userContact;
	}

}
