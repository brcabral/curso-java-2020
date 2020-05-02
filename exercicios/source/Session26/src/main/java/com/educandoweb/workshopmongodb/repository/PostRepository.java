package com.educandoweb.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.workshopmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	//
}