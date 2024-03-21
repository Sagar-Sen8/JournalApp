package com.striker.journalApp.repository;

import com.striker.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {




       User findByUserName(String userName);
}
