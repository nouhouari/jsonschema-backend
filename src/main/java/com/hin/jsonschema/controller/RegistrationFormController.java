package com.hin.jsonschema.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hin.jsonschema.model.RegistrationForm;
import com.hin.jsonschema.repository.RegistrationFormRepo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("registrationform")
@AllArgsConstructor
public class RegistrationFormController {
    
    private RegistrationFormRepo repo;

    @PostMapping
    @PutMapping
    @ResponseBody
    public RegistrationForm save(@RequestBody RegistrationForm registrationForm){
        return repo.save(registrationForm);
    }

    @GetMapping("{id}")
    public ResponseEntity<RegistrationForm> getById(@PathVariable String id){
        Optional<RegistrationForm> byId = repo.findById(id);
        if (byId.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(byId.get());
    }

    @GetMapping
    public ResponseEntity<RegistrationForm> getLatest(){
        Optional<RegistrationForm> latest = repo.findFirstByOrderByCreatedOnDesc();
        if (latest.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(latest.get());
    }

}
