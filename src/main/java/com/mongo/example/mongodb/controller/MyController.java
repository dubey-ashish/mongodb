package com.mongo.example.mongodb.controller;

import com.mongo.example.mongodb.models.Student;
import com.mongo.example.mongodb.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class MyController
{
    @Autowired
    StudentRepository studentRepository;


    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Student student)
    {
        studentRepository.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

    @GetMapping("/read")
    public ResponseEntity<?> read()
    {
        return ResponseEntity.status(HttpStatus.OK).body(studentRepository.findAll());

    }


}
