package com.mango.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mango.entity.Tutorial;

@Repository
public interface TutorialRepo extends MongoRepository<Tutorial, String> {
	
	List<Tutorial> findByPublished(boolean published);

	List<Tutorial> findByTitleContaining(String title);

}
