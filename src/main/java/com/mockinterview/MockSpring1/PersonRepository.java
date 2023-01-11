package com.mockinterview.MockSpring1;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class PersonRepository {

    private HashMap<Long, Person> personMap;

    // Initializing the Hashmap
    public PersonRepository(HashMap<Long, Person> personMap) {
        this.personMap = new HashMap<Long, Person>();
    }

    public void addPerson(Person person)
    {
        personMap.put(person.getAadharNumber(), person);
    }

    public Person getPerson(Long aadharNumber)
    {
        return personMap.get(aadharNumber);
    }
}
