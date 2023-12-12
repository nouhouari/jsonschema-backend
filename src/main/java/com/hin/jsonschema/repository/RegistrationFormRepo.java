package com.hin.jsonschema.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hin.jsonschema.model.RegistrationForm;

public interface RegistrationFormRepo extends JpaRepository<RegistrationForm, String>{
    
    Optional<RegistrationForm> findFirstByOrderByCreatedOnDesc();
}
