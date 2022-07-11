package com.luizbati.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.luizbati.workshopmongo.domain.Post;
import com.luizbati.workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

	
	

}
