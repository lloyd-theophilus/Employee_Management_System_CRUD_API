package com.api.app.model;
// lombok is used to reduce code boilerplate for setters and getters
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="employees")
public class Employee {
    // Mapping columns to table titles
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstname;

    @Column(name = "last_name", nullable = false)
    private String lastname;

    @Column(name = "email", nullable = false)
    private String email;
}
