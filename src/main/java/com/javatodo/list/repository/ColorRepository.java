package com.javatodo.list.repository;

import com.javatodo.list.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ColorRepository extends JpaRepository<Color, Integer> {
}
