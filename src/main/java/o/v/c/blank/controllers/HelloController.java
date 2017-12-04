package o.v.c.blank.controllers;

import java.util.Locale;
import java.util.concurrent.Callable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import o.v.c.blank.beans.HelloBean;
import o.v.c.blank.models.PersonModel;
import o.v.c.blank.models.PersonRepository;

@Controller
public class HelloController {
	
	@Autowired
	private HelloBean helloBean;

	@Autowired
	private PersonRepository persons;
	
	@GetMapping(value = "/hello")
	Callable<String> hello(Locale locale, Model model) {
		this.helloBean.setMessage("bean message");
		model.addAttribute("hello", this.helloBean);
		final PersonModel person = new PersonModel();
		person.setName("Joe");
		person.setCountry("Ukreine");
		return new Callable<String>() {
			@Override
			public
			String call() {
				persons.save(person);
				return "/hello";
			}
		};
	}
}
