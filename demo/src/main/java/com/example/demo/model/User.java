package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity(name = "user")
@AllArgsConstructor
public class User {
    @Id
    private UUID id=UUID.randomUUID();
    private String name;
    private int Age;
}
