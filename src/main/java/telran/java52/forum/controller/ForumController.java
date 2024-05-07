package telran.java52.forum.controller;

import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import telran.java52.forum.dto.CommentAddDto;
import telran.java52.forum.dto.DateSearchDto;
import telran.java52.forum.dto.PostAddDto;
import telran.java52.forum.dto.PostDto;
import telran.java52.forum.service.ForumService;

@RestController
public class ForumController {

	ForumService forumService;

	@PostMapping("/forum/post/{author}")
	public PostDto addPost(@PathVariable String author, @RequestBody PostAddDto postAddDto) {
		return forumService.addPost(author, postAddDto);
	}

	@GetMapping("/forum/post/{id}")
	public PostDto findPostById(@PathVariable String id) {
		return forumService.findPostById(id);
	}

	@PutMapping("/forum/post/{id}/like")
	public void addLike(@PathVariable String id) {
		forumService.addLike(id);
		
	}

	@GetMapping("/forum/posts/author/{author}")
	public List<PostDto> findPostsByAuthor(@PathVariable String author) {
		return forumService.findPostsByAuthor(author);
	}

	@PutMapping("/forum/post/{id}/comment/{author}")
	public PostDto addComment(@PathVariable String id, @PathVariable String author, @RequestBody CommentAddDto commentAddDto) {
		return forumService.addComment(id, author, commentAddDto);
	}

	@DeleteMapping("/forum/post/{id}")
	public PostDto deletePost(@PathVariable String id) {
		return forumService.deletePost(id);
	}

	@PostMapping("/forum/posts/tags")
	public List<PostDto> findPostsByTags(@RequestBody Set<String> tags) {
		return forumService.findPostsByTags(tags);
	}

	@PostMapping("/forum/posts/period")
	public List<PostDto> findPostsByPeriod(@RequestBody DateSearchDto dateSearchDto) {
		return forumService.findPostsByPeriod(dateSearchDto);
	}

	@PutMapping("/forum/post/{id}")
	public PostDto updatePost(@PathVariable String id, @RequestBody PostAddDto postAddDto) {
		return forumService.updatePost(id, postAddDto);
	}
}
