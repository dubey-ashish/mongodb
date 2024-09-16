package com.mongo.example.mongodb.repo;

import com.mongo.example.mongodb.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,Integer> //instead of JPA
{

}
