package com.reddit.RedditApp.model;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import javax.validation.constraints.NotBlank;
import com.reddit.RedditApp.model.User;
import com.reddit.RedditApp.model.Subreddit;

import java.time.Instant;


@Data // To get the getters and setters of the class
@Builder // Builder Design Pattern
@AllArgsConstructor // Generates the constructors for the class
@NoArgsConstructor
@Entity

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    @NotBlank(message = "Post name cannot be empty or Null")
    private String postName;
    @Nullable
    private String URL;
    @Nullable
    @Lob
    private String description;
    private Integer voteCount;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;
    private Instant createdDate;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Subreddit subreddit;



}
