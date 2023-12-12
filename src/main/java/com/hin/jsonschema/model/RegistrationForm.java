package com.hin.jsonschema.model;

import java.util.Date;

import org.hibernate.annotations.ColumnTransformer;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class RegistrationForm {

    @GeneratedValue(strategy=GenerationType.UUID)
    @Id
    private String id;

    @Column(columnDefinition = "jsonb")
    @ColumnTransformer(write = "?::jsonb")
    private String formDefinition;

    @CreatedDate
    private Date createdOn;
}
