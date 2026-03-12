package com.todolistapp.To_Do.List.App.repository;

import com.todolistapp.To_Do.List.App.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
}
