package com.example.demo.SpringBatchConfiguration;

import com.example.demo.Model.ExamScore;
import com.example.demo.Repository.StudentRepo;
import org.springframework.batch.core.job.Job;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.Step;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.infrastructure.item.ItemProcessor;
import org.springframework.batch.infrastructure.item.ItemReader;
import org.springframework.batch.infrastructure.item.ItemWriter;
import org.springframework.batch.infrastructure.item.data.RepositoryItemWriter;
import org.springframework.batch.infrastructure.item.file.FlatFileItemReader;
import org.springframework.batch.infrastructure.item.file.LineMapper;
import org.springframework.batch.infrastructure.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.infrastructure.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.infrastructure.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.infrastructure.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class SpringBatchConfig {

    @Autowired
    StudentRepo studentRepo;

    @Bean
    public StudentProcess process(){
        return new StudentProcess();
    }

    @Bean
    public Job job(JobRepository jobRepository, Step step){
        return new JobBuilder("job",jobRepository)
                .start(step)
                .build();
    }

    @Bean
    public Step step(JobRepository jobRepository,
                     PlatformTransactionManager transactionManager,
                     ItemReader<ExamScore> reader,
                     ItemProcessor<ExamScore, ExamScore> process,
                     ItemWriter<ExamScore> writer) {

        return new StepBuilder("step", jobRepository)
                .<ExamScore, ExamScore>chunk(10)
                .reader(reader)
                .processor(process)
                .writer(writer)
                .transactionManager(transactionManager)
                .build();
    }


    @Bean
    public FlatFileItemReader<ExamScore> reader(){
        return new FlatFileItemReaderBuilder<ExamScore>()
                .name("reader-csv")
                .resource(new ClassPathResource("Exam_Score_Prediction.csv"))
                .linesToSkip(1)
                .lineMapper(lineMapper())
                .targetType(ExamScore.class)
                .build();
    }

    @Bean
    public LineMapper<ExamScore> lineMapper(){
        DefaultLineMapper<ExamScore> defaultLineMapper = new DefaultLineMapper<>();
        DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
        delimitedLineTokenizer.setDelimiter(",");
        delimitedLineTokenizer.setNames("studentId",
                "age",
                "gender",
                "course",
                "studyHours",
                "classAttendance",
                "internetAccess",
                "sleepHours",
                "sleepQuality",
                "studyMethod",
                "facilityRating",
                "examDifficulty",
                "examScore");
        BeanWrapperFieldSetMapper<ExamScore> beanWrapperFieldSetMapper = new BeanWrapperFieldSetMapper<>();
        beanWrapperFieldSetMapper.setTargetType(ExamScore.class);
        defaultLineMapper.setFieldSetMapper(beanWrapperFieldSetMapper);
        defaultLineMapper.setLineTokenizer(delimitedLineTokenizer);

        return defaultLineMapper;
    }

    @Bean
    public RepositoryItemWriter<ExamScore> writer(StudentRepo studentRepo){
        RepositoryItemWriter<ExamScore> repositoryItemWriter = new RepositoryItemWriter<ExamScore>(studentRepo);
        //repositoryItemWriter.setRepository(studentRepo);
        repositoryItemWriter.setMethodName("save");

        return repositoryItemWriter;
    }

}
