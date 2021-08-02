package com.example.priority.noSqlRepos;

import com.example.priority.documents.UsersResponse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepository extends MongoRepository<UsersResponse, String> {

}
