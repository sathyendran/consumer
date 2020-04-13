package org.sathya.producer.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Employee implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
