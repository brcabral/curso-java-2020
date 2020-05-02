package com.educandoweb.workshopmongodb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.workshopmongodb.domain.Post;
import com.educandoweb.workshopmongodb.repository.PostRepository;
import com.educandoweb.workshopmongodb.service.exception.ObjectNotFoundException;

@Service
public class PostService {
	@Autowired
	private PostRepository repository;

	public Post findById(String id) {
		Optional<Post> post = repository.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Post not found"));
	}
}
