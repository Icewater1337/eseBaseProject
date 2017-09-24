package ch.unibe.ese.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.unibe.ese.controller.forms.UserForm;
import ch.unibe.ese.model.User;
import ch.unibe.ese.model.service.SampleService;

@Controller
public class MainController {
	
	@Autowired
	SampleService sampleService;
	
	

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    
	
	@GetMapping("/addUser")
	public String addUser(UserForm userForm) {
		//model.addAttribute("userForm", new UserForm());
		
		return "addUser";
		
	}
	
	@PostMapping("/addUser")
	public String addUserSubmit (@Valid @ModelAttribute UserForm userForm, BindingResult bindingResult) {
		
		if ( bindingResult.hasErrors()) {
			return "/addUser";
		}
		// call the service to save the form.
		sampleService.saveForm(userForm);
		
		return "/result";
	}

}