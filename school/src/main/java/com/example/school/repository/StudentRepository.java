package com.example.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.school.model.Stud;

public interface StudentRepository extends JpaRepository<Stud, Integer> {

}
