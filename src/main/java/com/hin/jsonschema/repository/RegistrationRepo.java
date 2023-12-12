package com.hin.jsonschema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hin.jsonschema.model.Registration;

public interface RegistrationRepo extends JpaRepository<Registration, String>{
    
}
