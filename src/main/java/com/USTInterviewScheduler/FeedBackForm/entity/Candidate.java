package com.USTInterviewScheduler.FeedBackForm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="interviewresult_tab")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private String interviewDate;

    private String interviewTime;

    private String interviewerName;

    private String interviewResult;

//    @Column(length = 500)
    private String interviewComments;



}
