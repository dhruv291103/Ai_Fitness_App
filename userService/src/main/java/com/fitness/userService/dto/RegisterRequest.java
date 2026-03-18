package com.fitness.userService.dto;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

//RegisterRequest class ye batayega ki kis tarah se request hamare application me aayengi
@Data
public class RegisterRequest {
    @NotBlank(message= "Email is required")
    @Email(message= "Invalid email format")
    private String email;

    @NotBlank(message= "Password is required")
    @Size(min=6, message="Password must have atleast 6 characters")
    private String password;

    private String firstName;
    private String lastName;
}
