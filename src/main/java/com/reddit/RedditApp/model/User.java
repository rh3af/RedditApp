package com.reddit.RedditApp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.Instant;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data // To get the getters and setters of the class
@Builder // Builder Design Pattern
@AllArgsConstructor // Generates the constructors for the class
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotBlank(message = "Username cannot be empty or Null")
    private String username;
    @NotBlank(message = "Password cannot be empty or Null")
    private String password;
    @Email
    @NotBlank(message = "Please Enter an email")
    private String email;
    private Instant created;
    private boolean enabled;




}
