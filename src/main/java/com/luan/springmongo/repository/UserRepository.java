package com.luan.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.luan.springmongo.domain.User;



@Repository
public interface UserRepository extends MongoRepository<User, String> {

}