package ir.javacup.demo.controller;

import ir.javacup.demo.controller.api.PersonSaveRequest;
import ir.javacup.demo.controller.api.PersonSaveResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRestController {

	public PersonSaveResponse save(PersonSaveRequest request) {
		return null; // TODO implement
	}

}
