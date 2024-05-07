package telran.java52.forum.dto;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class PostDto {

	String id;
    String title;
    String content;
    String author;
    LocalDateTime dateCreated;
    String[] tags;
    Integer likes;
    CommentDto[] comments;
}
