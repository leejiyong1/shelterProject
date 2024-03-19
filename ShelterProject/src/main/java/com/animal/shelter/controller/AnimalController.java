package com.animal.shelter.controller;
import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.animal.shelter.service.AnimalService;

@RestController
@RequestMapping("/animals")
public class AnimalController {
	
	@Autowired
    private AnimalService animalService;

    @GetMapping("/")
    public String test() throws Exception {
        return "test";
    }
    
    @GetMapping("/abandoned")
    public String getAbandonedAnimals() throws Exception {
        return animalService.getAbandonedAnimals();
    }
}