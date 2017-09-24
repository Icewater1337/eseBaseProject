package ch.unibe.ese.controller.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class UserForm {

	private String vorname;
	private String nachname;
	
	private String nickname;
	
	@NotNull
	@Pattern(regexp = "^[a-z0-9_\\-\\.]{2,}@[a-z0-9_\\-\\.]{2,}\\.[a-z]{2,}$", message = "Please enter a valid email address.")  
	private String email;

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
 
	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
