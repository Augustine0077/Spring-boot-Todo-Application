package dev.HelloWorld.demo;

import dev.HelloWorld.demo.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long>
{

}
