package com.crud.hibernet.demo.service;
import com.crud.hibernet.demo.model.Person;
import com.crud.hibernet.demo.model.PersonAndMessage;
import com.crud.hibernet.demo.model.PersonEntity;
import com.crud.hibernet.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonEntity createPerson(Person person){
        PersonEntity personEntity = new PersonEntity();
        personEntity.setFirstName(person.getFirstName());
        personEntity.setLastName(person.getLastName());
        personEntity.setAddressLine1(person.getAddressLine1());
        personEntity.setAddressLine2(person.getAddressLine2());
        personEntity.setCity(person.getCity());
        personEntity.setZipCode(person.getZipCode());
        return personRepository.save(personEntity);
    }

    public PersonEntity[] getAllPersons(){
        return personRepository.findAll().toArray(new PersonEntity[0]);
    }

    public PersonAndMessage getPerson(long id) {
        Optional<PersonEntity> op = personRepository.findById(id);
        PersonAndMessage personAndMessage = new PersonAndMessage();
        if(op.isPresent()) {
            personAndMessage.setId(op.get().getId());
            personAndMessage.setFirstName(op.get().getFirstName());
            personAndMessage.setLastName(op.get().getLastName());
            personAndMessage.setAddressLine1(op.get().getAddressLine1());
            personAndMessage.setAddressLine2(op.get().getAddressLine2());
            personAndMessage.setCity(op.get().getCity());
            personAndMessage.setZipCode(op.get().getZipCode());
            personAndMessage.setMessage("Person is founded");
        } else {
            personAndMessage.setMessage("Person not Founded");
        }
        return personAndMessage;
    }
}
