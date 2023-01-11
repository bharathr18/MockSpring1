package com.mockinterview.MockSpring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public void addPerson(Person person)
    {
        personRepository.addPerson(person);
    }

    public Person findPerson(Long aadharNumber)
    {
        return personRepository.getPerson(aadharNumber);
    }
}
