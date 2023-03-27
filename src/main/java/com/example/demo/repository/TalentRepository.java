package com.example.demo.repository;

import com.example.demo.model.Talent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TalentRepository extends MongoRepository<Talent, String> {

}
