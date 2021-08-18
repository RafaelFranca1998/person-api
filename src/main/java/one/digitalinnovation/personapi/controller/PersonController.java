package one.digitalinnovation.personapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.personapi.dto.MessageResponseDTO;
import one.digitalinnovation.personapi.model.Person;
import one.digitalinnovation.personapi.service.PersonService;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

	private PersonService service;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED, value = HttpStatus.CREATED)
	public MessageResponseDTO createPerson(@RequestBody Person person) {
		return service.createPerson(person);
	}

}
