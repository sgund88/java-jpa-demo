package com.crud.hibernet.demo.controller;

import com.crud.hibernet.demo.model.Person;
import com.crud.hibernet.demo.model.PersonAndMessage;
import com.crud.hibernet.demo.model.PersonEntity;
import com.crud.hibernet.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping(path="/person")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<PersonEntity> createPerson(@RequestBody Person person){
        return ResponseEntity.ok(personService.createPerson(person));
    }

    @GetMapping(path="/persons")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<PersonEntity[]> getAllPersons(){
        return ResponseEntity.ok(personService.getAllPersons());
    }

    @GetMapping(path="/persons/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<PersonAndMessage> getPerson(@PathVariable("id") long id){
        return ResponseEntity.ok(personService.getPerson(id));
    }
}
