package com.hin.jsonschema.model;


import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnTransformer;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import lombok.Data;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Registration {
    
    @GeneratedValue(generator = "UUID")
    @Id
    private UUID id;

    @CreatedDate
    private Date createdOn;

    @javax.persistence.Column(columnDefinition = "jsonb")
    @ColumnTransformer(write = "?::jsonb")
    private String registrationData;
    
}
