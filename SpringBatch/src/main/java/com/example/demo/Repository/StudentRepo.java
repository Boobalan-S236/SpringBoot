package com.example.demo.Repository;

import com.example.demo.Model.ExamScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface StudentRepo extends JpaRepository<ExamScore,Integer> {


}
