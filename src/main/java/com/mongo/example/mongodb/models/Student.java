package com.mongo.example.mongodb.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Document(collection="students") //instead of @Entity
public class Student
{
    private int id;
    private String name;
    private String city;
    private String college;

}
