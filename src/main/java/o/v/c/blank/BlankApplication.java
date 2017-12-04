package o.v.c.blank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import o.v.c.blank.models.PersonRepository;

@SpringBootApplication
public class BlankApplication {
	

	@Autowired
	private PersonRepository persons;

	public static void main(String[] args) {
		SpringApplication.run(BlankApplication.class, args);
	}
}
