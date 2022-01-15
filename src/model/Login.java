package model;

public class Login {
	private User user;
	private UsernamePassword usernamePassword;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UsernamePassword getUsernamePassword() {
		return usernamePassword;
	}

	public void setUsernamePassword(UsernamePassword usernamePassword) {
		this.usernamePassword = usernamePassword;
	}

}
