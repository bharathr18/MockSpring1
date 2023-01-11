package com.mockinterview.MockSpring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("people")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/add-person")
    public String addPerson(@RequestBody Person person)
    {
        personService.addPerson(person);
        return "Person added to database successfully";
    }

    @GetMapping("/get-person-by-id/{aadharNumber}")
    public Person getPerson(@PathVariable Long aadharNumber)
    {
        Person person = personService.findPerson(aadharNumber);
        return person;
    }
}
