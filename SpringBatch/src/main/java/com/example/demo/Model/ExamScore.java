package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ExamScore {
    @Id
    @Column(name = "student_id")
    private Integer studentId;

    private Integer age;

    private String gender;

    private String course;

    @Column(name = "study_hours")
    private Double studyHours;

    @Column(name = "class_attendance")
    private Double classAttendance;

    @Column(name = "internet_access")
    private String internetAccess;

    @Column(name = "sleep_hours")
    private Double sleepHours;

    @Column(name = "sleep_quality")
    private String sleepQuality;

    @Column(name = "study_method")
    private String studyMethod;

    @Column(name = "facility_rating")
    private String facilityRating;

    @Column(name = "exam_difficulty")
    private String examDifficulty;

    @Column(name = "exam_score")
    private Double examScore;

}
