package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Devloper;



public interface DevloperRepository  extends JpaRepository<Devloper, Long> {

}
