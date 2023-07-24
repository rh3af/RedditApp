package com.reddit.RedditApp.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import javax.validation.constraints.NotBlank;
import com.reddit.RedditApp.model.User;

import java.time.Instant;
import java.util.List;

@NoArgsConstructor
@Entity
@Table(name = "token")
public class VerificationToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String token;
    @OneToOne(fetch = FetchType.LAZY)
    private User user;
    private Instant expiryDate;





    // Other fields, constructors, and methods.

}
