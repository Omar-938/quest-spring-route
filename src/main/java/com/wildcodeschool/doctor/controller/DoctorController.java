package com.wildcodeschool.doctor.controller;

import com.wildcodeschool.doctor.model.Doctor;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class DoctorController {

    @GetMapping("/doctor/{id}")
    @ResponseBody
    public Doctor getDoctor(@PathVariable int id) {
        if (id == 13) {
            return new Doctor(13, "Jodie");
        } else if (id >= 1 && id < 13) {
            throw new ResponseStatusException(
                    HttpStatus.SEE_OTHER);
        } else {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "le numéro " + id  + " n'éxiste pas");
        }
    }
}