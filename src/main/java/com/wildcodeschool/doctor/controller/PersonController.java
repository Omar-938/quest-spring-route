package com.wildcodeschool.doctor.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wildcodeschool.doctor.model.Person;

public class PersonController {
    
    @GetMapping("/person")
@ResponseBody
public Person personSample() {

    return new Person("John Doe", 30);
}


}
