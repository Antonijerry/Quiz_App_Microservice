package com.Antonie.Jerry.quizservice.dao;


import com.Antonie.Jerry.quizservice.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
