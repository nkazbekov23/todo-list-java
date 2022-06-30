package com.javatodo.list.repository;

import com.javatodo.list.model.TodoLists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListRepository extends JpaRepository<TodoLists, Integer> {

}
