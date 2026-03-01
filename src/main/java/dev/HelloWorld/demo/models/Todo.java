package dev.HelloWorld.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue
    long id;
    String title;
    String Discription;
    Boolean isComplete;

}
