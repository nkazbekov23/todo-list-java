package com.javatodo.list.repository;

import com.javatodo.list.model.Lists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListRepository extends JpaRepository<Lists, Integer> {

}
