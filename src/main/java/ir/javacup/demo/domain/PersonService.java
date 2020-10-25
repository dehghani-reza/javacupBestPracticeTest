package ir.javacup.demo.domain;

import ir.javacup.demo.domain.api.PersonSaveParam;
import ir.javacup.demo.domain.api.PersonSaveResult;

public interface PersonService {

	PersonSaveResult save(PersonSaveParam param);

}
