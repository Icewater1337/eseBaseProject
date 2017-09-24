package ch.unibe.ese.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.unibe.ese.controller.forms.UserForm;
import ch.unibe.ese.model.User;
import ch.unibe.ese.model.repository.UserRepository;

@Service
public class SampleService {

	@Autowired
	UserRepository userRepo;
	
	
	/**
	 * takes the info from the form, creates an user from it and saves him.
	 * @param userForm
	 * @return
	 */
	public UserForm saveForm(UserForm userForm) {
		User user = new User();
		user.setEmail(userForm.getEmail());
		user.setNachname(userForm.getNachname());
		user.setVorname(userForm.getVorname());
		user.setNickname(userForm.getNickname());
		
		userRepo.save(user);
		
		return userForm;
		
	}
	
	public String addLiToNick (String nickname) {
		
		String liNick = nickname.concat("li");
		
		
		return liNick;
		
	}
}
