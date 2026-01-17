package com.example.demo.SpringBatchConfiguration;


import com.example.demo.Model.ExamScore;
import org.jspecify.annotations.Nullable;
import org.springframework.batch.infrastructure.item.ItemProcessor;

public class StudentProcess implements ItemProcessor<ExamScore,ExamScore> {

    @Override
    public ExamScore process(ExamScore item) throws Exception {
       item.setCourse(item.getCourse().toUpperCase());
       return item;
    }
}
