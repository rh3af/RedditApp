package com.reddit.RedditApp.model;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import javax.validation.constraints.NotBlank;
import com.reddit.RedditApp.model.User;

import java.time.Instant;
import java.util.List;

@Data // To get the getters and setters of the class
@Builder // Builder Design Pattern
@AllArgsConstructor // Generates the constructors for the class
@NoArgsConstructor
@Entity
public class Subreddit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Subreddit name cannot be be empty ")
    private String name;
    @NotBlank(message = "Subreddit description cannot be be empty ")
    private String description;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Post> posts;
    private Instant createdDate;
    @ManyToOne(fetch=FetchType.LAZY)
    private User user;



}
