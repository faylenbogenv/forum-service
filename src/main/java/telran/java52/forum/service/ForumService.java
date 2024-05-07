package telran.java52.forum.service;

import java.util.List;
import java.util.Set;

import telran.java52.forum.dto.CommentAddDto;
import telran.java52.forum.dto.DateSearchDto;
import telran.java52.forum.dto.PostAddDto;
import telran.java52.forum.dto.PostDto;

public interface ForumService {

	PostDto addPost(String author, PostAddDto postAddDto);
	
	PostDto findPostById(String id);
	
	void addLike(String id);
	
	List<PostDto> findPostsByAuthor(String author);
	
	PostDto addComment(String id, String author, CommentAddDto commentAddDto);
	
	PostDto deletePost(String id);
	
	List<PostDto> findPostsByTags(Set<String> tags);
	
	List<PostDto> findPostsByPeriod(DateSearchDto dateSearchDto);
	
	PostDto updatePost(String id, PostAddDto postAddDto);
}
