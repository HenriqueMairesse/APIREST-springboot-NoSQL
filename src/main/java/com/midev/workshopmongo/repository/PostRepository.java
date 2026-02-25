package com.midev.workshopmongo.repository;

import com.midev.workshopmongo.domain.Post;
import com.midev.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
